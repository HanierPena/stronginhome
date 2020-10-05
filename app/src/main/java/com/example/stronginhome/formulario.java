package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

public class formulario extends AppCompatActivity {
    private Spinner spinner1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        spinner1 = (Spinner)findViewById(R.id.spinner);
        String [] opciones = {"Mujer","Hombre"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(  this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);

    }

    public void mostrarEjercicios(View view){
        Intent intent = new Intent(this, Ejercicios.class);
        startActivity(intent);
    }

}