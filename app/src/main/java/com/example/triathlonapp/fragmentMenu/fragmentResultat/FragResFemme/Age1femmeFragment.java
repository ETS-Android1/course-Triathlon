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
 * Use the {@link Age1femmeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Age1femmeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Age1femmeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Age1femmeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Age1femmeFragment newInstance(String param1, String param2) {
        Age1femmeFragment fragment = new Age1femmeFragment();
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
        View v = inflater.inflate(R.layout.fragment_age1femme, container, false);
        super.onCreate(savedInstanceState);


        TabItem arr = v.findViewById(R.id.ArriveFA1);
        TabItem nat = v.findViewById(R.id.NatationFA1);
        TabItem vel = v.findViewById(R.id.VeloFA1);
        TabItem course = v.findViewById(R.id.CourseFA1);


        final TabLayout tabLayout = v.findViewById(R.id.tabBarFA1);
        PagerAdapterFA1 pagerAdapterfa1 = new PagerAdapterFA1(this, getChildFragmentManager());
        //PagerAdapter pagerAdapter =new PagerAdapter(getActivity(),getFragmentManager());
        final ViewPager viewPagerfa1 = v.findViewById(R.id.viewpagescoreFA1);


        viewPagerfa1.setAdapter(pagerAdapterfa1);

        tabLayout.setupWithViewPager(viewPagerfa1);



        return v ;
    }
}