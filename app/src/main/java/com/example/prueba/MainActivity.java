package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;


import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
     MediaPlayer sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonido = MediaPlayer.create(this,R.raw.inicio);
        sonido.start();
        TimerTask happen = new TimerTask() {
            @Override
            public void run() {

                Intent continu = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(continu);
                finish();
            }
        };
        Timer time = new Timer();
        time.schedule(happen,4000);
    }
}