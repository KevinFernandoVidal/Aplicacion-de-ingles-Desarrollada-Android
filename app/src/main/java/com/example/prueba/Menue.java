package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Menue extends AppCompatActivity {

    Button BtnNumeros, BtnAnimales, BtnFrutas;
    TextView txWelcome;
    Bundle extras;
    String txtNick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue);

        BtnAnimales = (Button)findViewById(R.id.BtnAnimales);
        BtnFrutas = (Button)findViewById(R.id.BtnFrutas);
        BtnNumeros = (Button)findViewById(R.id.BtnNumeros);
        txWelcome = (TextView)findViewById(R.id.txWelcome);

        BtnNumeros.setOnClickListener(v -> {
            Intent numeros = new Intent(Menue.this, NumbersActivity.class);
            startActivity(numeros);
        });
        BtnFrutas.setOnClickListener(v -> {
            Intent frutas = new Intent(Menue.this, Frutas.class);
            startActivity(frutas);
        });
        BtnAnimales.setOnClickListener(v -> {
            Intent animales = new Intent(Menue.this, AnimalsActivity.class);
            startActivity(animales);
        });
        extras = getIntent().getExtras();
        txtNick = extras.getString("txtNick");
        txWelcome.setText("Bienvenido a la Learning English" + txtNick);

    }
}