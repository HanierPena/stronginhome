package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ejercicioAccion extends AppCompatActivity {
    public static final String RUTINA ="idRutina";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_accion);
        getIntent();
    }
}