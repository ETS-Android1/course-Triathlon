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
 * Use the {@link HA1NatationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HA1NatationFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HA1NatationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HA1NatationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HA1NatationFragment newInstance(String param1, String param2) {
        HA1NatationFragment fragment = new HA1NatationFragment();
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
        View v = inflater.inflate(R.layout.fragment_h_a1_natation, container, false);
        final MyDatabase dbm=new MyDatabase(getActivity(),"joueur",null,5);


        List<ScoreData> scores = dbm.readTop10("Homme","09","15","natation",7);

        TextView age1= v.findViewById(R.id.A1HN1);
        age1.setText(scores.get(0).toString4());


        TextView name1= v.findViewById(R.id.N1HN1);
        TextView equi1= v.findViewById(R.id.E1HN1);
        TextView arr1= v.findViewById(R.id.T1HN1);
        name1.setText(scores.get(0).toString1());
        equi1.setText(scores.get(0).toString2());
        arr1.setText(scores.get(0).toString3());


        TextView age2= v.findViewById(R.id.A2HN1);
        age2.setText(scores.get(1).toString4());
        TextView name2= v.findViewById(R.id.N2HN1);
        TextView equi2= v.findViewById(R.id.E2HN1);
        TextView arr2= v.findViewById(R.id.T2HN1);
        name2.setText(scores.get(1).toString1());
        equi2.setText(scores.get(1).toString2());
        arr2.setText(scores.get(1).toString3());

        TextView age3= v.findViewById(R.id.A3HN1);
        age3.setText(scores.get(2).toString4());
        TextView name3= v.findViewById(R.id.N3HN1);
        TextView equi3= v.findViewById(R.id.E3HN1);
        TextView arr3= v.findViewById(R.id.T3HN1);
        name3.setText(scores.get(2).toString1());
        equi3.setText(scores.get(2).toString2());
        arr3.setText(scores.get(2).toString3());



        TextView name4= v.findViewById(R.id.N4HN1);
        TextView equi4= v.findViewById(R.id.E4HN1);
        TextView arr4= v.findViewById(R.id.T4HN1);
        name4.setText(scores.get(3).toString1());
        equi4.setText(scores.get(3).toString2());
        arr4.setText(scores.get(3).toString3());
        TextView age4= v.findViewById(R.id.A4HN1);
        age4.setText(scores.get(3).toString4());




        TextView name5= v.findViewById(R.id.N5HN1);
        TextView equi5= v.findViewById(R.id.E5HN1);
        TextView arr5= v.findViewById(R.id.T5HN1);
        name5.setText(scores.get(4).toString1());
        equi5.setText(scores.get(4).toString2());
        arr5.setText(scores.get(4).toString3());
        TextView age5= v.findViewById(R.id.A5HN1);
        age5.setText(scores.get(4).toString4());




        TextView name6= v.findViewById(R.id.N6HN1);
        TextView equi6= v.findViewById(R.id.E6HN1);
        TextView arr6= v.findViewById(R.id.T6HN1);
        name6.setText(scores.get(5).toString1());
        equi6.setText(scores.get(5).toString2());
        arr6.setText(scores.get(5).toString3());
        TextView age6= v.findViewById(R.id.A6HN1);
        age6.setText(scores.get(5).toString4());


        TextView name7= v.findViewById(R.id.N7HN1);
        TextView equi7= v.findViewById(R.id.E7HN1);
        TextView arr7= v.findViewById(R.id.T7HN1);
        name7.setText(scores.get(6).toString1());
        equi7.setText(scores.get(6).toString2());
        arr7.setText(scores.get(6).toString3());
        TextView age7= v.findViewById(R.id.A7HN1);
        age7.setText(scores.get(6).toString4());


        TextView name8= v.findViewById(R.id.N8HN1);
        TextView equi8= v.findViewById(R.id.E8HN1);
        TextView arr8= v.findViewById(R.id.T8HN1);
        name8.setText(scores.get(7).toString1());
        equi8.setText(scores.get(7).toString2());
        arr8.setText(scores.get(7).toString3());
        TextView age8= v.findViewById(R.id.A8HN1);
        age8.setText(scores.get(7).toString4());


        TextView name9= v.findViewById(R.id.N9HN1);
        TextView equi9= v.findViewById(R.id.E9HN1);
        TextView arr9= v.findViewById(R.id.T9HN1);
        name9.setText(scores.get(8).toString1());
        equi9.setText(scores.get(8).toString2());
        arr9.setText(scores.get(8).toString3());
        TextView age9= v.findViewById(R.id.A9HN1);
        age9.setText(scores.get(8).toString4());

        TextView name10= v.findViewById(R.id.N10HN1);
        TextView equi10= v.findViewById(R.id.E10HN1);
        TextView arr10= v.findViewById(R.id.T10HN1);
        name10.setText(scores.get(9).toString1());
        equi10.setText(scores.get(9).toString2());
        arr10.setText(scores.get(9).toString3());
        TextView age10= v.findViewById(R.id.A10HN1);
        age10.setText(scores.get(9).toString4());



        dbm.close();

        return  v ;
    }
}