package com.example.triathlonapp.fragmentMenu.fragmentResultat;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FemmeFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.Age1femmeFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.Age2femmeFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.Age3femmeFragment;

public class PagerAdapterF extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.age1, R.string.age2,R.string.age3};
    private final FemmeFragment mContext;

    public PagerAdapterF(FemmeFragment context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new Age1femmeFragment();
                break;
            case 1 :
                fragment = new Age2femmeFragment();
                break;
            case 2 :
                fragment = new Age3femmeFragment();

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
