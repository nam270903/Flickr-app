package vn.edu.usth.flickrapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.flickrapp.Adapter.NotificationAdapter;
import vn.edu.usth.flickrapp.Model.Image;
import vn.edu.usth.flickrapp.Model.Notification;
import vn.edu.usth.flickrapp.Model.User;
import vn.edu.usth.flickrapp.R;

public class NotificationFragment extends Fragment {
    private static User user;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notification, container, false);

        RecyclerView recyclerView = v.findViewById(R.id.recyclerViewNotifications);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<Notification> notifications = new ArrayList<>();
        List<Image> lstImage = new ArrayList<>();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference notificationsRef = database.getReference("notification");
        notificationsRef.orderByChild("email").equalTo(user.email).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for (DataSnapshot userSnapshot : dataSnapshot.getChildren()) {
                        String uri_noti = getValue("uri", userSnapshot);
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference imagesRef = database.getReference("images_url");
                        imagesRef.orderByChild("uri").equalTo(uri_noti).addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                    String uri = getValue("uri", snapshot);
                                    String email = getValue("email", snapshot);
                                    String likeCount = getValue("likeCount", snapshot);
                                    String commentCount = getValue("commentCount", snapshot);
                                    String content = getValue("content", snapshot);
                                    String type = getValue("type", snapshot);

                                    Image item = new Image(user.email, uri, likeCount, commentCount, content, "", email, type);
                                    lstImage.add(item);
                                }
                                notifications.add(new Notification(R.drawable.ic_ava, R.drawable.ic_like, getValue("content", userSnapshot),"", "", uri_noti));
                                NotificationAdapter adapter = new NotificationAdapter(notifications, lstImage, user, getContext());
                                recyclerView.setAdapter(adapter);
                                if (notifications.size() > 0) {
                                    recyclerView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                                }
                            }
                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        return v;
    }

    public String getValue(String path, DataSnapshot userSnapshot)
    {
        return userSnapshot.child(path).getValue(String.class);
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static NotificationFragment newInstance(String text, User user) {
        NotificationFragment f = new NotificationFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);
        f.setArguments(b);
        f.setUser(user);
        return f;
    }
}