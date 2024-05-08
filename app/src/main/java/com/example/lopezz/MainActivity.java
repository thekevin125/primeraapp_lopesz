package com.example.lopezz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView txtTitulo1;
    ImageView img1;
    Button btnsiguiente;
    ImageView whasap;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // le doy a mis variables declaradas para que puedan ver las propiedades de las view

        txtTitulo1 = findViewById(R.id.txtTitulo1);
        img1 = findViewById(R.id.img1);
        btnsiguiente = findViewById(R.id.btnSiguiente);
        whasap = findViewById(R.id.whasap);

        whasap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://wa.link/ow06pi"));
                startActivity(intent);
            }
        });

        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Declarar varible de tipo Intent para cambiar a la interfaz que  y sabemos  cual es
                Intent goNext = new Intent(MainActivity.this , MenuApp.class);
                startActivity(goNext);




            }
        });




    }
}