package com.example.triathlonapp.fragmentMenu;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age3;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age3homme.HA3ArriveFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age3homme.HA3NatationFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age3homme.HA3courseFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age3homme.HA3veloFragment;

public class PagerAdapterHA3 extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.arrive, R.string.natation,R.string.velo,R.string.course};
    private final age3 mContext;

    public PagerAdapterHA3(age3 context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new HA3ArriveFragment();
                break;
            case 1 :
                fragment = new HA3NatationFragment();
                break;
            case 2 :
                fragment = new HA3veloFragment();
                break;
            case 3 :
                fragment= new HA3courseFragment();

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
