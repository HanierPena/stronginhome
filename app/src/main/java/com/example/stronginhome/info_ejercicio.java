package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.widget.TextView;

public class info_ejercicio extends AppCompatActivity{
    private TextView nombre;
    private TextView fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_ejercicio);


        nombre = findViewById(R.id.tvNombre);
        fecha = findViewById(R.id.tvFecha);
        Intent intent = getIntent();
        String [] datos = intent.getStringArrayExtra("datos");

        nombre.setText(formulario.person.getNombre());

        Time today = new android.text.format.Time(android.text.format.Time.getCurrentTimezone());
        today.setToNow();
        int dia = today.monthDay;
        int mes = today.month;
        int ano = today.year;
        mes = mes +1;

        fecha.setText(mes + "/"+ dia +"/"+ano);







        // TextView mostrar = (TextView) findViewById(R.id.mensajeEnviado);
        // mostrar.setText(datos[0]);
    }
}