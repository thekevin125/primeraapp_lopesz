package com.example.lopezz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Juegos extends AppCompatActivity {


   TranslateAnimation translateAnimation;
   TextView juegos;
    MediaPlayer sonido1;
    MediaPlayer sonido2;
    ImageButton bntApple;
    ImageButton bntFresa;
    ImageButton bntPina;
    ImageButton bntBanano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);

        bntApple = findViewById(R.id.bntApple);
        bntFresa = findViewById(R.id.bntFresa);
        bntPina = findViewById(R.id.bntPina);
        bntBanano = findViewById(R.id.bntBanano);

        sonido1 = MediaPlayer.create(Juegos.this, R.raw.correct);
        sonido2 = MediaPlayer.create(Juegos.this, R.raw.incorrect);

        bntBanano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido2.start();
            }
        });
        bntPina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonido2.start();
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

                sonido1.start();
                Intent goNext = new Intent(Juegos.this, Juego2.class);
                startActivity(goNext);
            }
        });

        juegos=findViewById(R.id.juegos);

        translateAnimation = new TranslateAnimation(1000,0,0,0);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        juegos.startAnimation(translateAnimation);



    }
}