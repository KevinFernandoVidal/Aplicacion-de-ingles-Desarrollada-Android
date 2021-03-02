package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Frutas extends AppCompatActivity {
    private ImageView imgFresas, imgPapaya, imgUva;
    private TextView tvFresas, tvPapaya, tvUva;
    private MediaPlayer sonidPapaya, sonidFresas, sonidUva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);

        imgFresas = (ImageView) findViewById(R.id.imgFresas);
        imgPapaya = (ImageView) findViewById(R.id.imgPapaya);
        imgUva = (ImageView) findViewById(R.id.imgUvas);
        tvFresas = (TextView) findViewById(R.id.tvFresas);
        tvPapaya = (TextView) findViewById(R.id.tvtPapaya);
        tvUva = (TextView) findViewById(R.id.tvUva);
        sonidPapaya = MediaPlayer.create(this,R.raw.papaya);
        sonidFresas = MediaPlayer.create(this,R.raw.fresa);
        sonidUva = MediaPlayer.create(this,R.raw.uva);


        imgFresas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidFresas.start();
                tvFresas.setText(R.string.fresa);
            }
        });

        imgPapaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidPapaya.start();
                tvPapaya.setText(R.string.papaya);
            }
        });

        imgUva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidUva.start();
                tvUva.setText(R.string.uva);
            }
        });
    }
}