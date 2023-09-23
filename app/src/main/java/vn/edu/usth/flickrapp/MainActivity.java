package vn.edu.usth.flickrapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.menu_news) {
                    viewPager.setCurrentItem(0);
                }

                if (menuItem.getItemId() == R.id.menu_search) {
                    viewPager.setCurrentItem(1);
                }

                if (menuItem.getItemId() == R.id.menu_camera_access) {
                    viewPager.setCurrentItem(2);
                }

                if (menuItem.getItemId() == R.id.menu_search) {
                    viewPager.setCurrentItem(3);
                }

                if (menuItem.getItemId() == R.id.menu_profile) {
                    viewPager.setCurrentItem(4);
                }
                return false;
            };
        });
    }
}