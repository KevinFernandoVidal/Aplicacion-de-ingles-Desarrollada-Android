package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {
    private TextView TvtUno, tvUno,TvtDos, tvDos, TvtTres, tvTres;
    private MediaPlayer sonidUno, sonidDos, sonidTres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        tvUno= (TextView) findViewById(R.id.tvUno);
        TvtUno= (TextView) findViewById(R.id.TxtUno);
        tvDos= (TextView) findViewById(R.id.tvDos);
        TvtDos= (TextView) findViewById(R.id.TvtDos);
        tvTres= (TextView) findViewById(R.id.tvTres);
        TvtTres=(TextView) findViewById(R.id.TvtTres);
        sonidUno = MediaPlayer.create(this,R.raw.uno);
        sonidDos = MediaPlayer.create(this,R.raw.dos);
        sonidTres = MediaPlayer.create(this,R.raw.tres);


        TvtUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidUno.start();
                tvUno.setText(R.string.uno);
            }
        });
        TvtDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidDos.start();
                tvDos.setText(R.string.dos);
            }
        });
        TvtTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidTres.start();
                tvTres.setText(R.string.tres);
            }
        });
    }
}