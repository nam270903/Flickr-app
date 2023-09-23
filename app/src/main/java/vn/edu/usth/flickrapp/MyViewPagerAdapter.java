package vn.edu.usth.flickrapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import vn.edu.usth.flickrapp.Fragment.CamFragment;
import vn.edu.usth.flickrapp.Fragment.statsFragment;
import vn.edu.usth.flickrapp.Fragment.publicFragment;
import vn.edu.usth.flickrapp.Fragment.groupsFragment;
import vn.edu.usth.flickrapp.Fragment.AlbumsFragment;
public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: new CamFragment();
                return new CamFragment();
            case 1:
                return new publicFragment();
            case 2:
                return new AlbumsFragment();
            case 3:
                return new groupsFragment();
            case 4:
                return new statsFragment();
            default:
                return new CamFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
