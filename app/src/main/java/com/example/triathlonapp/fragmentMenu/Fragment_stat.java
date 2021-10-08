package com.example.triathlonapp.fragmentMenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.stat.PagerAdapterstat;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_stat#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_stat extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public Fragment_stat() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_stat.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_stat newInstance(String param1, String param2) {
        Fragment_stat fragment = new Fragment_stat();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_stat, container, false);
        super.onCreate(savedInstanceState);


        TabItem tous = v.findViewById(R.id.tous);
        TabItem stath = v.findViewById(R.id.stath);
        TabItem statf = v.findViewById(R.id.statf);

        final TabLayout tabLayout = v.findViewById(R.id.tabstat);
        PagerAdapterstat pagerAdapterstat = new PagerAdapterstat(this, getChildFragmentManager());
        //PagerAdapter pagerAdapter =new PagerAdapter(getActivity(),getFragmentManager());
        final ViewPager viewPagerstat = v.findViewById(R.id.viewpagescorestat);


        viewPagerstat.setAdapter(pagerAdapterstat);

        tabLayout.setupWithViewPager(viewPagerstat);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerstat.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        return v ;

    }
}