package com.example.juego_clases;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.juego_clases.vista.PantallaVideojuego;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static PantallaVideojuego pantallajuego;
    private ImageButton ibDerecha, ibIzquierda, ibArriba, ibAbajo, ibPausa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // ***** Ligo los recursos de la actividad *****
        pantallajuego = (PantallaVideojuego)findViewById(R.id.pantallajuego);
        ibDerecha = (ImageButton)findViewById(R.id.ibDerecha);
        ibIzquierda = (ImageButton)findViewById(R.id.ibIzquierda);
        ibArriba = (ImageButton)findViewById(R.id.ibArriba);
        ibAbajo = (ImageButton)findViewById(R.id.ibAbajo);
        ibPausa = (ImageButton)findViewById(R.id.ibPausa);
        // ************************************************

        ibAbajo.setOnClickListener(this);
        ibArriba.setOnClickListener(this);
        ibDerecha.setOnClickListener(this);
        ibIzquierda.setOnClickListener(this);
        ibPausa.setOnClickListener(this);

    }


    public void onClick(View view) {
        if(view.getId() == R.id.ibAbajo) {

            pantallajuego.cambiarDireccionAbajo();

        }else if(view.getId() == R.id.ibArriba) {
        pantallajuego.cambiarDireccionArriba();

        }else if(view.getId() == R.id.ibDerecha) {
            pantallajuego.cambiarDireccionDerecha();

        }else if(view.getId() == R.id.ibIzquierda) {
            pantallajuego.cambiarDireccionIzquierda();

        }else if(view.getId() == R.id.ibPausa) {
            pantallajuego.pausar();

        }
    }

}