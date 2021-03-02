package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import static android.net.Uri.*;

public class SignupActivity extends AppCompatActivity {
private ImageView imgRedd, imgFace, imgDisc, imgInta, imgTwit, imgTele;
private EditText txtName, txtSurn, txtAge, txtNick;
private Button btnRegi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Referenciar();

        btnRegi.setOnClickListener(v -> {
            PasarDatos();
            Intent siguiente = new Intent( SignupActivity.this, Menue.class);
            startActivity(siguiente);
        });

        imgTele.setOnClickListener(v -> {
            Intent tele = new Intent(Intent.ACTION_VIEW, parse("https://web.telegram.org/"));
             startActivity(tele);
        });
        imgTwit.setOnClickListener(v -> {
            Intent twit = new Intent(Intent.ACTION_VIEW, parse("https://twitter.com/"));
            startActivity(twit);
        });
        imgDisc.setOnClickListener(v -> {
            Intent disc = new Intent(Intent.ACTION_VIEW, parse("https://discord.com/"));
            startActivity(disc);
        });
        imgFace.setOnClickListener(v -> {
            Intent face = new Intent(Intent.ACTION_VIEW, parse("https://www.facebook.com/"));
            startActivity(face);
        });
        imgInta.setOnClickListener(v -> {
            Intent inta = new Intent(Intent.ACTION_VIEW, parse("https://www.instagram.com/"));
            startActivity(inta);
        });
        imgRedd.setOnClickListener(v -> {
            Intent redd = new Intent(Intent.ACTION_VIEW, parse("https://www.reddit.com/"));
            startActivity(redd);
        });

    }

    private void Referenciar(){
        imgDisc = (ImageView) findViewById(R.id.imgDisc);
        imgFace = (ImageView) findViewById(R.id.imgFacebook);
        imgInta = (ImageView) findViewById(R.id.imgInsta);
        imgRedd = (ImageView) findViewById(R.id.imgRedd);
        imgTwit = (ImageView) findViewById(R.id.imgTwi);
        imgTele = (ImageView) findViewById(R.id.imgTele);
        txtName = (EditText) findViewById(R.id.txtName);
        txtAge = (EditText) findViewById(R.id.txtAge);
        txtNick = (EditText) findViewById(R.id.txtNinckname);
        txtSurn = (EditText) findViewById(R.id.txtSurname);
        btnRegi = (Button) findViewById(R.id.button);
    }

    private void PasarDatos(){
        Intent paso = new Intent(SignupActivity.this, Menue.class);
        paso.putExtra("txtName",txtName.getText().toString());
        paso.putExtra("txtSurn",txtSurn.getText().toString());
        paso.putExtra("txtAge",txtAge.getText().toString());
        paso.putExtra("txtNick",txtNick.getText().toString());

    }
}