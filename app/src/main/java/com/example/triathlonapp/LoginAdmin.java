package com.example.triathlonapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        final MyDatabase mb=new MyDatabase(this,"joueur",null,5);

        final EditText id = findViewById(R.id.IDA);
        final EditText arr = findViewById(R.id.AdAr);
        final EditText nat = findViewById(R.id.natAd);
        final EditText vel = findViewById(R.id.velAd);
        final EditText cour = findViewById(R.id.courAD);
        Button btn_A =findViewById(R.id.btn_adm);
        btn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mb.modiff(id.getText().toString(),arr.getText().toString(),nat.getText().toString(),vel.getText().toString(),cour.getText().toString());


            }
        });


        Button conv_ = findViewById(R.id.conv);


         conv_.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 EditText hh_ = findViewById(R.id.hh);
                 EditText mm_ = findViewById(R.id.mm);
                 EditText ss_ = findViewById(R.id.ss);
                 final TextView resul = findViewById(R.id.resu) ;

                 String h , m , s ;
                 final String resulta_par_s;
                 h = hh_.getText().toString();
                 m = mm_.getText().toString();
                 s = ss_.getText().toString();
                 int res ;
                 int h_ ,m_ ,s_ ;
                 h_ = new Integer(h).intValue();
                 m_ = new Integer(m).intValue();
                 s_ = new Integer(s).intValue();


                if (h_>24 || m_>60 || s_>60 || hh_.getText().toString().isEmpty()|| mm_.getText().toString().isEmpty()|| ss_.getText().toString().isEmpty()){
                    Toast.makeText(LoginAdmin.this, "Ce temps est invalide ", Toast.LENGTH_SHORT).show();

                }
                else {
                    res = h_* 3600 + m_ * 60 + s_ ;
                    resulta_par_s = Integer.toString(res);
                    resul.setText(resulta_par_s);

                }



             }
         });





    }
}