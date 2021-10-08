package com.example.triathlonapp.fragmentMenu;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.Age2Fragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age2homme.HA2ArriveFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age2homme.HA2NatationFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age2homme.HA2courseFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age2homme.HA2veloFragment;

public class PagerAdapterHA2 extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.arrive, R.string.natation,R.string.velo,R.string.course};
    private final Age2Fragment mContext;


    //modif....
    public PagerAdapterHA2(Age2Fragment context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new HA2ArriveFragment();
                break;
            case 1 :
                fragment = new HA2NatationFragment();
                break;
            case 2 :
                fragment = new HA2veloFragment();
                break;
            case 3 :
                fragment= new HA2courseFragment();

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
