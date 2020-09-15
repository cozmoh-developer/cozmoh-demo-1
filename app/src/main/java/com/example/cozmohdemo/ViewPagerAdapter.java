package com.example.cozmohdemo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new Fragment_F1(); //ChildFragment1 at position 0
            case 1:
                return new Fragment_F2(); //ChildFragment2 at position 1
            case 2:
                return new Fragment_F3(); //ChildFragment3 at position 2
        }
        return null; //does not happen
    }

    @Override
    public int getItemCount() {
        return 3; //three fragments
    }
}