package vn.edu.usth.flickrapp.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behaviorResumeOnlyCurrentFragment) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 1:
                return new NewsFragment();

            case 2:
                return new SearchFragment();

            case 3:
                return new CameraAccess();

            case 4:
                return new NotificationFragment();

            default:
                return new ProfileFragment();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Home";
                break;

            case 1:
                title = "Search";
                break;

            case 2:
                title = "Camera";
                break;

            case 3:
                title = "Notification";
                break;

            case 4:
                title = "Profile";
                break;
        }
        return title;


    }
}