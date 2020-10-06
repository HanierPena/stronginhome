package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class formulario extends AppCompatActivity {
    private Spinner spinner1;
    private EditText nombretxt, edadtxt, estaturatxt, pesotxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        spinner1 = (Spinner)findViewById(R.id.spinner);
        String [] opciones = {"GENERO", "Mujer","Hombre"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(  this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);


    }

    public void mostrarEjercicios(View view){

        nombretxt = (EditText) findViewById(R.id.editTextTextPersonName);
        edadtxt = (EditText) findViewById(R.id.et_date);
        estaturatxt = (EditText) findViewById(R.id.editTextTextPersonName3);
        pesotxt = (EditText) findViewById(R.id.editTextTextPersonName4);
        spinner1 = (Spinner)findViewById(R.id.spinner);


        if(nombretxt.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Nombre vacio", Toast.LENGTH_SHORT).show();

        }else if (edadtxt.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Edad vacio", Toast.LENGTH_SHORT).show();

        }else  if (estaturatxt.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Estatura vacio", Toast.LENGTH_SHORT).show();

        }else  if(pesotxt.getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Peso vacio", Toast.LENGTH_SHORT).show();

        }else if (spinner1.getSelectedItem().toString().equals("GENERO")){
            Toast.makeText(this, "Campo Genero vacio", Toast.LENGTH_SHORT).show();
        }else{
             String [] datos = {nombretxt.getText().toString(), edadtxt.getText().toString(),
                    estaturatxt.getText().toString(),pesotxt.getText().toString(),
                    spinner1.getSelectedItem().toString()};

            Intent intent = new Intent(this, Ejercicios.class);
            intent.putExtra("datos", datos);
            startActivity(intent);


        }



    }

}