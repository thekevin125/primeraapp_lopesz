package com.example.lopezz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuApp extends AppCompatActivity {

    TextView titulo;
    Button bntColor;
    Button bntAnimal;
    Button bntfrutas;
    Button bntJuego;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);

        titulo = findViewById(R.id.titulo);
        bntColor = findViewById(R.id.bntColor);
        bntAnimal = findViewById(R.id.btnAnimales);
        bntfrutas = findViewById(R.id.btnfrutas);
        bntJuego = findViewById(R.id.bntJuego);

        bntJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent(MenuApp.this,Juegos.class);
                startActivity(goNext);

            }
        });
        bntColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent(MenuApp.this, Colores.class);
                startActivity(goNext);
            }
        });
        bntAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent(MenuApp.this , Animales.class);
                startActivity(goNext);
            }
        });
        bntfrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNext = new Intent(MenuApp.this , Frutas.class);
                startActivity(goNext);
            }
        });

    }
}