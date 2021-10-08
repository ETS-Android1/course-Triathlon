package com.example.triathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.triathlonapp.fragmentMenu.Fragment_home;

import java.util.Calendar;

public class Inscription2Main extends AppCompatActivity {
    private static final  String TAG = "Inscription2Mains";
    private TextView mDisplayDate  ;
    private  TextView eqpV ;
    private RadioGroup rg ;
    private RadioButton rb ;

    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription2);
        final MyDatabase mb=new MyDatabase(this,"joueur",null,5);
        final  EditText txt_Nom , txt_prenom , txt_age  ;
        txt_Nom=findViewById(R.id.ID_nom);
        txt_prenom=findViewById(R.id.ID_preom);
        txt_age=findViewById(R.id.ID_age);


        rg = findViewById(R.id.radioGroup);



       eqpV=findViewById(R.id.ID_equipe1);
       Bundle b=getIntent().getExtras();
       eqpV.setText(b.getString("_equipe"));
        Button btn_next ;
        btn_next=findViewById(R.id.next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( txt_age.getText().toString().isEmpty() || txt_Nom.getText().toString().isEmpty() || txt_prenom.getText().toString().isEmpty() )
                {
                    Toast.makeText(Inscription2Main.this , "Veuillez remplir tous les champs!", Toast.LENGTH_SHORT).show();

                }

                else {
                    int radioID = rg.getCheckedRadioButtonId();
                    rb = findViewById(radioID);
                    mb.AjouterJoueur(eqpV.getText().toString(), txt_Nom.getText().toString(), txt_prenom.getText().toString(), txt_age.getText().toString(), rb.getText().toString());
                    txt_Nom.setText("");
                    txt_prenom.setText("");
                    txt_age.setText("");
                }
            }
        });

        Button btn_home = findViewById(R.id.ID_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int radioID = rg.getCheckedRadioButtonId();
               // rb = findViewById(radioID);
               // mb.AjouterJoueur(eqpV.getText().toString(),txt_Nom.getText().toString(),txt_prenom.getText().toString(),txt_age.getText().toString(),rb.getText().toString());
                if( txt_age.getText().toString().isEmpty() || txt_Nom.getText().toString().isEmpty() || txt_prenom.getText().toString().isEmpty() )
                {
                    Toast.makeText(Inscription2Main.this , "Veuillez remplir tous les champs!", Toast.LENGTH_SHORT).show();

                }

                else {
                    int radioID = rg.getCheckedRadioButtonId();
                    rb = findViewById(radioID);
                    mb.AjouterJoueur(eqpV.getText().toString(), txt_Nom.getText().toString(), txt_prenom.getText().toString(), txt_age.getText().toString(), rb.getText().toString());
                    Intent it= new Intent(Inscription2Main.this , MainActivity.class);
                    startActivity(it);
                }




            }
        });








        mDisplayDate= (TextView) findViewById(R.id.tvDate);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog =  new DatePickerDialog(Inscription2Main.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month=month+1;
                Log.d(TAG,"onDateSet: mm/dd/yyy" + month + "/" + day +"/" + year);
                String date =  month + "/" + day +"/" + year;
                mDisplayDate.setText(date);
            }
        };



    }
    /*public void checkButton(View v){
        int radioID = rg.getCheckedRadioButtonId();
        rb = findViewById(radioID);


    }*/
}