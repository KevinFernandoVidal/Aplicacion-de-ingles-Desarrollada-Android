package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

public class Menue extends AppCompatActivity {

    TextView txWelcome;
    Bundle extras;
    String txtNick;
    ListView ListOpt;
    String[] Opcciones ={"Animales", "Frutas", "Numeros"};
    ArrayAdapter<String> adapter;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);


        txWelcome = (TextView)findViewById(R.id.txWelcome);
        ListOpt = (ListView) findViewById(R.id.ListOpt);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Opcciones);
        ListOpt.setAdapter(adapter);

        ListOpt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent animales = new Intent(Menue.this, AnimalsActivity.class);
                        startActivity(animales);
                        break;
                    case 1:
                        Intent frutas = new Intent(Menue.this, Frutas.class);
                        startActivity(frutas);
                        break;
                    case 2:
                        Intent numeros = new Intent(Menue.this, NumbersActivity.class);
                        startActivity(numeros);
                        break;
                }
            }
        });

        extras = getIntent().getExtras();
        txtNick = extras.getString("txtNick");
        txWelcome.setText("Bienvenido a Learning English " + txtNick);

    }
}