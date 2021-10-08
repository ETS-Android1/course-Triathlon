package com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.triathlonapp.R;
import com.example.triathlonapp.fragmentMenu.PagerAdapterHA3;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link age3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class age3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public age3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment age3.
     */
    // TODO: Rename and change types and number of parameters
    public static age3 newInstance(String param1, String param2) {
        age3 fragment = new age3();
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
        View v = inflater.inflate(R.layout.fragment_age3, container, false);
        super.onCreate(savedInstanceState);


        TabItem arr = v.findViewById(R.id.ArriveHA3);
        TabItem nat = v.findViewById(R.id.NatationHA3);
        TabItem vel = v.findViewById(R.id.VeloHA3);
        TabItem course = v.findViewById(R.id.CourseHA3);


        final TabLayout tabLayout = v.findViewById(R.id.tabBarHA3);
        PagerAdapterHA3 pagerAdapterha3 = new PagerAdapterHA3(this, getChildFragmentManager());
        //PagerAdapter pagerAdapter =new PagerAdapter(getActivity(),getFragmentManager());
        final ViewPager viewPagerha3 = v.findViewById(R.id.viewpagescoreHA3);


        viewPagerha3.setAdapter(pagerAdapterha3);

        tabLayout.setupWithViewPager(viewPagerha3);



        return v ;    }
}