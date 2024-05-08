package com.example.lopezz;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animales extends AppCompatActivity {
    //DECLARO LA VARIABLE
    MediaPlayer sonido1;
    MediaPlayer sonido2;
    MediaPlayer sonido3;
    Button bntCat;
    Button bntCow;
    Button bntDog;
    Button traductor;
    Button traductor2;
    Button traductor3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
        //Referencio el boton
        bntCat= findViewById(R.id.bntCat);
        bntCow= findViewById(R.id.bntCow);
        bntDog = findViewById(R.id.bntDog);

        traductor = findViewById(R.id.bntCat);
        traductor2 = findViewById(R.id.bntCow);
        traductor3 = findViewById(R.id.bntDog);


        //Creo el sonido
        sonido1  = MediaPlayer.create(Animales.this, R.raw.cat);
        sonido2 = MediaPlayer.create(Animales.this, R.raw.cow);
        sonido3 = MediaPlayer.create(Animales.this, R.raw.dog);
        //Evento clic del botom

        bntDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido3.start();
                traductor3.setText("Dog");
            }
        });
        bntCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido2.start();
                traductor2.setText("Cow");
            }
        });

        bntCat. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido1.start();
                traductor.setText("Cat");
            }
        });
    }
}