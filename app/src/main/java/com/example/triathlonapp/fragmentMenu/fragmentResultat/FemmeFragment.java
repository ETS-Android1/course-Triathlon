package com.example.triathlonapp.fragmentMenu.fragmentResultat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.triathlonapp.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FemmeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FemmeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FemmeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FemmeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FemmeFragment newInstance(String param1, String param2) {
        FemmeFragment fragment = new FemmeFragment();
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
        View v = inflater.inflate(R.layout.fragment_femme, container, false);
        super.onCreate(savedInstanceState);


        TabItem Age1 = v.findViewById(R.id.Age1F);
        TabItem Age2 = v.findViewById(R.id.Age2F);
        TabItem Age3 = v.findViewById(R.id.Age3F);

        final TabLayout tabLayout = v.findViewById(R.id.tabBarF);
        PagerAdapterF pagerAdapterf = new PagerAdapterF(this, getChildFragmentManager());
        //PagerAdapter pagerAdapter =new PagerAdapter(getActivity(),getFragmentManager());
        final ViewPager viewPagerf = v.findViewById(R.id.viewpagescoreF);


        viewPagerf.setAdapter(pagerAdapterf);

        tabLayout.setupWithViewPager(viewPagerf);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerf.setCurrentItem(tab.getPosition());
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