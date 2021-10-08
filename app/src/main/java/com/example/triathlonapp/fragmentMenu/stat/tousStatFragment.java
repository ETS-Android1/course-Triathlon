package com.example.triathlonapp.fragmentMenu.stat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.triathlonapp.MyDatabase;
import com.example.triathlonapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tousStatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tousStatFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public tousStatFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tousStatFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static tousStatFragment newInstance(String param1, String param2) {
        tousStatFragment fragment = new tousStatFragment();
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
        View v= inflater.inflate(R.layout.fragment_tous_stat, container, false);
        final MyDatabase dbm=new MyDatabase(getActivity(),"joueur",null,5);

        int nbrh = dbm.nbre("Homme");
        String s =Integer.toString(nbrh);
        TextView nbrH = v.findViewById(R.id.nbrsHomme2);
        nbrH.setText(s);

        int nbrf = dbm.nbre("Femme");
        String nbrfemme =Integer.toString(nbrf);
        TextView nbrF = v.findViewById(R.id.nbrFemme2);
        nbrF.setText(nbrfemme);

        int nbrage = dbm.nbreage("09","15");
        String nbrage1 =Integer.toString(nbrage);
        TextView nbrA = v.findViewById(R.id.n2);
        nbrA.setText(nbrage1);

        int nbrage2 = dbm.nbreage("14","20");
        String nbrage22 =Integer.toString(nbrage2);
        TextView nbrA2 = v.findViewById(R.id.nn2);
        nbrA2.setText(nbrage22);

        int nbrage3 = dbm.nbreage("20","50");
        String nbrage33 =Integer.toString(nbrage3);
        TextView nbrA3 = v.findViewById(R.id.nnn2);
        nbrA3.setText(nbrage33);














        return v ;
    }
}