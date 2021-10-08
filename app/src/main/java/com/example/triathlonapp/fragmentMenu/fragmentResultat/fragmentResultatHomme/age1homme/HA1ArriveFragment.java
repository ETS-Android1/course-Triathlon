package com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age1homme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.triathlonapp.MyDatabase;
import com.example.triathlonapp.R;
import com.example.triathlonapp.ScoreData;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HA1ArriveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HA1ArriveFragment extends Fragment {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public HA1ArriveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HA1ArriveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HA1ArriveFragment newInstance(String param1, String param2) {
        HA1ArriveFragment fragment = new HA1ArriveFragment();
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
        View v = inflater.inflate(R.layout.fragment_h_a1_arrive, container, false);
        final MyDatabase dbm=new MyDatabase(getActivity(),"joueur",null,5);


        List<ScoreData> scores = dbm.readTop10("Homme","09","15","arrive",6);

        TextView age1= v.findViewById(R.id.A1);
        age1.setText(scores.get(0).toString4());


        TextView name1= v.findViewById(R.id.N1);
        TextView equi1= v.findViewById(R.id.E1);
        TextView arr1= v.findViewById(R.id.T1);
        name1.setText(scores.get(0).toString1());
        equi1.setText(scores.get(0).toString2());
        arr1.setText(scores.get(0).toString3());


        TextView age2= v.findViewById(R.id.A2);
        age2.setText(scores.get(1).toString4());
        TextView name2= v.findViewById(R.id.N2);
        TextView equi2= v.findViewById(R.id.E2);
        TextView arr2= v.findViewById(R.id.T2);
        name2.setText(scores.get(1).toString1());
        equi2.setText(scores.get(1).toString2());
        arr2.setText(scores.get(1).toString3());

        TextView age3= v.findViewById(R.id.A3);
        age3.setText(scores.get(2).toString4());
        TextView name3= v.findViewById(R.id.N3);
        TextView equi3= v.findViewById(R.id.E3);
        TextView arr3= v.findViewById(R.id.T3);
        name3.setText(scores.get(2).toString1());
        equi3.setText(scores.get(2).toString2());
        arr3.setText(scores.get(2).toString3());



        TextView name4= v.findViewById(R.id.N4);
        TextView equi4= v.findViewById(R.id.E4);
        TextView arr4= v.findViewById(R.id.T4);
        name4.setText(scores.get(3).toString1());
        equi4.setText(scores.get(3).toString2());
        arr4.setText(scores.get(3).toString3());
        TextView age4= v.findViewById(R.id.A4);
        age4.setText(scores.get(3).toString4());




        TextView name5= v.findViewById(R.id.N5);
        TextView equi5= v.findViewById(R.id.E5);
        TextView arr5= v.findViewById(R.id.T5);
        name5.setText(scores.get(4).toString1());
        equi5.setText(scores.get(4).toString2());
        arr5.setText(scores.get(4).toString3());
        TextView age5= v.findViewById(R.id.A5);
        age5.setText(scores.get(4).toString4());




        TextView name6= v.findViewById(R.id.N6);
        TextView equi6= v.findViewById(R.id.E6);
        TextView arr6= v.findViewById(R.id.T6);
        name6.setText(scores.get(5).toString1());
        equi6.setText(scores.get(5).toString2());
        arr6.setText(scores.get(5).toString3());
        TextView age6= v.findViewById(R.id.A6);
        age6.setText(scores.get(5).toString4());


        TextView name7= v.findViewById(R.id.N7);
        TextView equi7= v.findViewById(R.id.E7);
        TextView arr7= v.findViewById(R.id.T7);
        name7.setText(scores.get(6).toString1());
        equi7.setText(scores.get(6).toString2());
        arr7.setText(scores.get(6).toString3());
        TextView age7= v.findViewById(R.id.A7);
        age7.setText(scores.get(6).toString4());


        TextView name8= v.findViewById(R.id.N8);
        TextView equi8= v.findViewById(R.id.E8);
        TextView arr8= v.findViewById(R.id.T8);
        name8.setText(scores.get(7).toString1());
        equi8.setText(scores.get(7).toString2());
        arr8.setText(scores.get(7).toString3());
        TextView age8= v.findViewById(R.id.A8);
        age8.setText(scores.get(7).toString4());


        TextView name9= v.findViewById(R.id.N9);
        TextView equi9= v.findViewById(R.id.E9);
        TextView arr9= v.findViewById(R.id.T9);
        name9.setText(scores.get(8).toString1());
        equi9.setText(scores.get(8).toString2());
        arr9.setText(scores.get(8).toString3());
        TextView age9= v.findViewById(R.id.A9);
        age9.setText(scores.get(8).toString4());

       TextView name10= v.findViewById(R.id.N10);
        TextView equi10= v.findViewById(R.id.E10);
        TextView arr10= v.findViewById(R.id.T10);
        name10.setText(scores.get(9).toString1());
        equi10.setText(scores.get(9).toString2());
        arr10.setText(scores.get(9).toString3());
        TextView age10= v.findViewById(R.id.A10);
        age10.setText(scores.get(9).toString4());



        dbm.close();

        return  v ;
    }
}