package com.example.triathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InscriptionMain extends AppCompatActivity {
    private Button btn;
    private EditText eqp , nat ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iscription);

        final MyDatabase mb=new MyDatabase(this,"joueur",null,5);

        eqp= findViewById(R.id.ID_equipe);
        nat = findViewById(R.id.ID_natio);


        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( eqp.getText().toString().isEmpty()  || nat.getText().toString().isEmpty()){
                    Toast.makeText(InscriptionMain.this , "Veuillez remplir tous les champs!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(InscriptionMain.this,Inscription2Main.class);
                    Bundle b=new Bundle();
                    b.putString("_equipe",eqp.getText().toString());
                    i.putExtras(b);
                    mb.AjouterEquipe(eqp.getText().toString(),nat.getText().toString());
                    startActivity(i);

                }

            }
        });
    }
}