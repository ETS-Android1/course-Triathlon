package com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A2F.FA2ArriveFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A2F.FA2NatationFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A2F.FA2courseFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A2F.FA2veloFragment;

public class PagerAdapterFA2 extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.arrive, R.string.natation,R.string.velo,R.string.course};
    private final Age2femmeFragment mContext;

    public PagerAdapterFA2(Age2femmeFragment context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new FA2ArriveFragment();
                break;
            case 1 :
                fragment = new FA2NatationFragment();
                break;
            case 2 :
                fragment = new FA2veloFragment();
                break;
            case 3 :
                fragment= new FA2courseFragment();

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
