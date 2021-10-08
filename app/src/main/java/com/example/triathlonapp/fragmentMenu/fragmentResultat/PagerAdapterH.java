package com.example.triathlonapp.fragmentMenu.fragmentResultat;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.HommeFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.Age1Fragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.Age2Fragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age3;

public class PagerAdapterH extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.age1, R.string.age2,R.string.age3};
    private final HommeFragment mContext;

    public PagerAdapterH(HommeFragment context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new Age1Fragment();
                break;
            case 1 :
                fragment = new Age2Fragment();
                break;
            case 2 :
                fragment = new age3();

        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}
