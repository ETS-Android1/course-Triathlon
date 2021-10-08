package com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A1F.FA1ArriveFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A1F.FA1NatationFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A1F.FA1courseFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A1F.FA1veloFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.Age1femmeFragment;

public class PagerAdapterFA1 extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.arrive, R.string.natation,R.string.velo,R.string.course};
    private final Age1femmeFragment mContext;

    public PagerAdapterFA1(Age1femmeFragment context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new FA1ArriveFragment();
                break;
            case 1 :
                fragment = new FA1NatationFragment();
                break;
            case 2 :
                fragment = new FA1veloFragment();
                break;
            case 3 :
                fragment= new FA1courseFragment();

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
        return 4;
    }
}
