package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
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
    
    public void comenzarEjer(View view){
        Intent intent = getIntent();
        String  rutina = intent.getStringExtra("rutina");
        Intent intento = new Intent(this, ejercicioAccion.class);
        intento.putExtra("rutina", rutina);
        startActivity(intento);

    }
}