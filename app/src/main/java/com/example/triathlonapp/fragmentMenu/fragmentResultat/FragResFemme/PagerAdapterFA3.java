package com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A3F.FA3ArriveFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A3F.FA3NatationFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A3F.FA3courseFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.A3F.FA3veloFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme.Age3femmeFragment;

public class PagerAdapterFA3 extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.arrive, R.string.natation,R.string.velo,R.string.course};
    private final Age3femmeFragment mContext;

    public PagerAdapterFA3(Age3femmeFragment context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new FA3ArriveFragment();
                break;
            case 1 :
                fragment = new FA3NatationFragment();
                break;
            case 2 :
                fragment = new FA3veloFragment();
                break;
            case 3 :
                fragment= new FA3courseFragment();

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
