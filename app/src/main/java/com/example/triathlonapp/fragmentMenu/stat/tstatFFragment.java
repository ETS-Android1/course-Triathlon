package com.example.triathlonapp.fragmentMenu.stat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.triathlonapp.MyDatabase;
import com.example.triathlonapp.R;
import com.example.triathlonapp.StatData;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tstatFFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tstatFFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public tstatFFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tstatFFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static tstatFFragment newInstance(String param1, String param2) {
        tstatFFragment fragment = new tstatFFragment();
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
        View v = inflater.inflate(R.layout.fragment_tstat_f, container, false);
        final MyDatabase dbm=new MyDatabase(getActivity(),"joueur",null,5);


        TextView statViewf1 = v.findViewById(R.id.statvf1);
        TextView statViewf2 = v.findViewById(R.id.statvf2);
        TextView statViewf3 = v.findViewById(R.id.statvf3);
        TextView statViewf4 = v.findViewById(R.id.statvf4);


        List<StatData> stats = dbm.stat10("Femme");
        for(StatData stat : stats) {
            statViewf1.append((stat.toString1()+ "\n\n"));
            statViewf2.append((stat.toString2()+ "\n\n"));
            statViewf3.append((stat.toString3()+ "\n\n"));
            statViewf4.append((stat.toString4()+ "\n\n"));

        }
        dbm.close();


        return  v ;

    }
}