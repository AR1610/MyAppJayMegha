package com.myappjaymegha;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int tabCount;

    public MyPagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
this.tabCount = tabCount;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                AFragment aFragment = new AFragment();
                return aFragment;
            case 1:
                BFragment bFragment = new BFragment();
                return bFragment;
            case 2:
                AFragment aFragment1 = new AFragment();
                return aFragment1;

        }

        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
