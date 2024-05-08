package com.example.lopezz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


    public class Juego2 extends AppCompatActivity {
        Button bntApple;
        Button bntFresa;
        Button bntPina;
        Button bntKiwi;
        MediaPlayer sonido1;
        MediaPlayer sonido2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_juego2);

            bntApple = findViewById(R.id.bntApple);
            bntFresa = findViewById(R.id.bntFresa);
            bntPina = findViewById(R.id.bntPina);
            bntKiwi = findViewById(R.id.bntKiwi);

            sonido1 = MediaPlayer.create(Juego2.this, R.raw.correct);
            sonido2 = MediaPlayer.create(Juego2.this, R.raw.incorrect);

            bntKiwi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonido2.start();
                }
            });
            bntPina.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonido1.start();
                    Intent goNext = new Intent(Juego2.this, Juego6.class);
                    startActivity(goNext);

                }
            });
            bntFresa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonido2.start();
                }
            });
            bntApple.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonido2.start();
                }
            });

        }
    }