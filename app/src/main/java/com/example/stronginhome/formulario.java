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

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class formulario extends AppCompatActivity {
    private Spinner spinner1;
    private TextInputLayout nombretxt, edadtxt, estaturatxt, pesotxt;
    static Persona person;

    public formulario(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        spinner1 = (Spinner)findViewById(R.id.spinner);
        String [] opciones = {"GENERO", "Mujer","Hombre"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(  this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Imposible volver", Toast.LENGTH_SHORT).show();
    }

    public void mostrarEjercicios(View view){

        nombretxt = (TextInputLayout) findViewById(R.id.editTextTextPersonName);
        edadtxt = (TextInputLayout) findViewById(R.id.et_date);
        estaturatxt = (TextInputLayout) findViewById(R.id.editTextTextPersonName3);
        pesotxt = (TextInputLayout) findViewById(R.id.editTextTextPersonName4);
        spinner1 = (Spinner)findViewById(R.id.spinner);


        if(nombretxt.getEditText().getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Nombre vacio", Toast.LENGTH_SHORT).show();

        }else if (edadtxt.getEditText().getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Edad vacio", Toast.LENGTH_SHORT).show();

        }else  if (estaturatxt.getEditText().getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Estatura vacio", Toast.LENGTH_SHORT).show();

        }else  if(pesotxt.getEditText().getText().toString().isEmpty()){
            Toast.makeText(this, "Campo Peso vacio", Toast.LENGTH_SHORT).show();

        }else if (spinner1.getSelectedItem().toString().equals("GENERO")){
            Toast.makeText(this, "Campo Genero vacio", Toast.LENGTH_SHORT).show();
        }else{
           /*  String [] datos = {nombretxt.getEditText().getText().toString(), edadtxt.getEditText().getText().toString(),
                    estaturatxt.getEditText().getText().toString(),pesotxt.getEditText().getText().toString(),
                    spinner1.getSelectedItem().toString()};*/
             person = new Persona();
             person.setNombre(nombretxt.getEditText().getText().toString());
             person.setEdad(Integer.parseInt(edadtxt.getEditText().getText().toString()));
             person.setGenero(spinner1.getSelectedItem().toString());
             person.setEstatura(Float.parseFloat(estaturatxt.getEditText().getText().toString()));
             person.setPeso(Integer.parseInt(pesotxt.getEditText().getText().toString()));


            Intent intent = new Intent(this, Tips.class);
            /*intent.putExtra("datos", datos);*/
            startActivity(intent);


        }



    }

}