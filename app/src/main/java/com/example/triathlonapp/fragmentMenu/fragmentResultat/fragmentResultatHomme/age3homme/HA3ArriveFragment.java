package com.example.triathlonapp.fragmentMenu.fragmentResultat.fragmentResultatHomme.age3homme;

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
 * Use the {@link HA3ArriveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HA3ArriveFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HA3ArriveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HA3ArriveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HA3ArriveFragment newInstance(String param1, String param2) {
        HA3ArriveFragment fragment = new HA3ArriveFragment();
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
        View v= inflater.inflate(R.layout.fragment_h_a3_arrive, container, false);
        final MyDatabase dbm=new MyDatabase(getActivity(),"joueur",null,5);


        List<ScoreData> scores = dbm.readTop10("Homme","19","50","arrive",6);

        TextView age1= v.findViewById(R.id.A113);
        age1.setText(scores.get(0).toString4());


        TextView name1= v.findViewById(R.id.N113);
        TextView equi1= v.findViewById(R.id.E113);
        TextView arr1= v.findViewById(R.id.T113);
        name1.setText(scores.get(0).toString1());
        equi1.setText(scores.get(0).toString2());
        arr1.setText(scores.get(0).toString3());


        TextView age2= v.findViewById(R.id.A213);
        age2.setText(scores.get(1).toString4());
        TextView name2= v.findViewById(R.id.N213);
        TextView equi2= v.findViewById(R.id.E213);
        TextView arr2= v.findViewById(R.id.T213);
        name2.setText(scores.get(1).toString1());
        equi2.setText(scores.get(1).toString2());
        arr2.setText(scores.get(1).toString3());

        TextView age3= v.findViewById(R.id.A313);
        age3.setText(scores.get(2).toString4());
        TextView name3= v.findViewById(R.id.N313);
        TextView equi3= v.findViewById(R.id.E313);
        TextView arr3= v.findViewById(R.id.T313);
        name3.setText(scores.get(2).toString1());
        equi3.setText(scores.get(2).toString2());
        arr3.setText(scores.get(2).toString3());



        TextView name4= v.findViewById(R.id.N413);
        TextView equi4= v.findViewById(R.id.E413);
        TextView arr4= v.findViewById(R.id.T413);
        name4.setText(scores.get(3).toString1());
        equi4.setText(scores.get(3).toString2());
        arr4.setText(scores.get(3).toString3());
        TextView age4= v.findViewById(R.id.A413);
        age4.setText(scores.get(3).toString4());




        TextView name5= v.findViewById(R.id.N513);
        TextView equi5= v.findViewById(R.id.E513);
        TextView arr5= v.findViewById(R.id.T513);
        name5.setText(scores.get(4).toString1());
        equi5.setText(scores.get(4).toString2());
        arr5.setText(scores.get(4).toString3());
        TextView age5= v.findViewById(R.id.A513);
        age5.setText(scores.get(4).toString4());




        TextView name6= v.findViewById(R.id.N613);
        TextView equi6= v.findViewById(R.id.E613);
        TextView arr6= v.findViewById(R.id.T613);
        name6.setText(scores.get(5).toString1());
        equi6.setText(scores.get(5).toString2());
        arr6.setText(scores.get(5).toString3());
        TextView age6= v.findViewById(R.id.A613);
        age6.setText(scores.get(5).toString4());


        TextView name7= v.findViewById(R.id.N713);
        TextView equi7= v.findViewById(R.id.E713);
        TextView arr7= v.findViewById(R.id.T713);
        name7.setText(scores.get(6).toString1());
        equi7.setText(scores.get(6).toString2());
        arr7.setText(scores.get(6).toString3());
        TextView age7= v.findViewById(R.id.A713);
        age7.setText(scores.get(6).toString4());


        TextView name8= v.findViewById(R.id.N813);
        TextView equi8= v.findViewById(R.id.E813);
        TextView arr8= v.findViewById(R.id.T813);
        name8.setText(scores.get(7).toString1());
        equi8.setText(scores.get(7).toString2());
        arr8.setText(scores.get(7).toString3());
        TextView age8= v.findViewById(R.id.A813);
        age8.setText(scores.get(7).toString4());


        TextView name9= v.findViewById(R.id.N913);
        TextView equi9= v.findViewById(R.id.E913);
        TextView arr9= v.findViewById(R.id.T913);
        name9.setText(scores.get(8).toString1());
        equi9.setText(scores.get(8).toString2());
        arr9.setText(scores.get(8).toString3());
        TextView age9= v.findViewById(R.id.A913);
        age9.setText(scores.get(8).toString4());

        TextView name10= v.findViewById(R.id.N1013);
        TextView equi10= v.findViewById(R.id.E1013);
        TextView arr10= v.findViewById(R.id.T1013);
        name10.setText(scores.get(9).toString1());
        equi10.setText(scores.get(9).toString2());
        arr10.setText(scores.get(9).toString3());
        TextView age10= v.findViewById(R.id.A1013);
        age10.setText(scores.get(9).toString4());



        dbm.close();

        return  v ;
    }
}