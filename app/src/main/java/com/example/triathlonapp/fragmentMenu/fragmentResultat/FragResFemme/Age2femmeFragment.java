package com.example.triathlonapp.fragmentMenu.fragmentResultat.FragResFemme;

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
 * Use the {@link Age2femmeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Age2femmeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Age2femmeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Age2femmeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Age2femmeFragment newInstance(String param1, String param2) {
        Age2femmeFragment fragment = new Age2femmeFragment();
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
        View v = inflater.inflate(R.layout.fragment_age2femme, container, false);
        super.onCreate(savedInstanceState);


        TabItem arr = v.findViewById(R.id.ArriveFA2);
        TabItem nat = v.findViewById(R.id.NatationFA2);
        TabItem vel = v.findViewById(R.id.VeloFA2);
        TabItem course = v.findViewById(R.id.CourseFA2);


        final TabLayout tabLayout = v.findViewById(R.id.tabBarFA2);
        PagerAdapterFA2 pagerAdapterfa2 = new PagerAdapterFA2(this, getChildFragmentManager());
        //PagerAdapter pagerAdapter =new PagerAdapter(getActivity(),getFragmentManager());
        final ViewPager viewPagerfa2 = v.findViewById(R.id.viewpagescoreFA2);


        viewPagerfa2.setAdapter(pagerAdapterfa2);

        tabLayout.setupWithViewPager(viewPagerfa2);



        return v ;
    }
}