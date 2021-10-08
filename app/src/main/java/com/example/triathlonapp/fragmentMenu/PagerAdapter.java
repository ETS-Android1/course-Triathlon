package com.example.triathlonapp.fragmentMenu;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.FemmeFragment;
import com.example.triathlonapp.fragmentMenu.fragmentResultat.HommeFragment;


public class PagerAdapter extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Fragment_result mContext;

    public PagerAdapter(Fragment_result context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new HommeFragment();
                break;
            case 1 :
                fragment = new FemmeFragment();
                break;

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
        return 2;
    }
}

   /* private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();


    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
    public  void addFragment(Fragment fragment , String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }*/







    /* @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null ;
        switch (position){
            case 0 :
                fragment = new HommeFragment();
                break;
            case 1 :
                fragment = new FemmeFragment();
                break;

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
        return 2;
    }

   /*private final int numOFTabs ;


    public PagerAdapter(FragmentManager fm , int numOFTabs) {
        super(fm);

        this.numOFTabs = numOFTabs ;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case  0 :
                return new HommeFragment();
            case 1 :
                return  new FemmeFragment();
            default:
                return  null ;
        }

    }
    @Nullable
    @Override
    public int getCount() {

        return 2 ;
    }*/

