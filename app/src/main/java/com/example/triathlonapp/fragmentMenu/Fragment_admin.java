package com.example.triathlonapp.fragmentMenu;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.triathlonapp.LoginAdmin;
import com.example.triathlonapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_admin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_admin extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private EditText admin_name;
    private EditText pwd_admin ;

    private  String Username ="admin";
    private  String pwd ="admin";
    boolean isValid;

    public Fragment_admin() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_admin.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_admin newInstance(String param1, String param2) {
        Fragment_admin fragment = new Fragment_admin();
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
        View view = inflater.inflate(R.layout.fragment_admin, container, false);



        admin_name = view.findViewById(R.id.name_admin);
        pwd_admin = view.findViewById(R.id.pwd_admin);



        final Button btn_admin =(Button) view.findViewById(R.id.btn_login);

        btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputname = admin_name.getText().toString();
                String inputpwd= pwd_admin.getText().toString();

                if (inputname.isEmpty() || inputpwd.isEmpty()){

                    Toast.makeText(getActivity() , "Veuillez remplir tous les champs!", Toast.LENGTH_SHORT).show();
                }
                else {
                    isValid = valide(inputname , inputpwd );
                    if (!isValid){
                        Toast.makeText(getActivity(), "Ces données sont incorrectes", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        btn_admin.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent in = new Intent(getActivity(), LoginAdmin.class );
                                startActivity(in);
                            }
                        });


                        //return view;
                    }

                }


            }
        });
        return view;


    }

    private boolean valide (String name ,String password ){
        if (name.equals(Username)&& password.equals(pwd)){
            return true ;
        }
        return false;
    }


}