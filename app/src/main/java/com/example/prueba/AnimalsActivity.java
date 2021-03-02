package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalsActivity extends AppCompatActivity {
    private  ImageView imgKoala, imgLeon, imgLoro;
    private  TextView tvKoala, tvLeon, tvLoro;
    private MediaPlayer sonidLoro, sonidLeon, sonidKoala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        imgKoala = (ImageView) findViewById(R.id.imgKoala);
        imgLeon = (ImageView) findViewById(R.id.imgLeon);
        imgLoro = (ImageView) findViewById(R.id.imgLoro);
        tvKoala = (TextView) findViewById(R.id.tvKoala);
        tvLoro = (TextView) findViewById(R.id.tvLoro);
        tvLeon = (TextView) findViewById(R.id.tvLeon);
        sonidLeon = MediaPlayer.create(this,R.raw.leon);
        sonidLoro = MediaPlayer.create(this,R.raw.loro);
        sonidKoala = MediaPlayer.create(this,R.raw.koala);

        imgKoala.setOnClickListener(v -> {
            tvKoala.setText(R.string.koala);
            sonidKoala.start();
        });
        imgLeon.setOnClickListener(v -> {
            sonidLeon.start();
            tvLeon.setText(R.string.leon);
        });
        imgLoro.setOnClickListener(v -> {
            sonidLoro.start();
            tvLoro.setText(R.string.loro);
        });
    }
}