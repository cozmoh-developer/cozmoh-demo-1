package com.example.cozmohdemo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter2 extends FragmentStateAdapter{

    public ViewPagerAdapter2(FragmentActivity fa) {
        super(fa);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new Fragment_P1(); //ChildFragment1 at position 0
            case 1:
                return new Fragment_P2(); //ChildFragment2 at position 1
            case 2:
                return new Fragment_P3(); //ChildFragment3 at position 2
        }
        return null; //does not happen
    }

    @Override
    public int getItemCount() {
        return 3; //three fragments
    }
}
