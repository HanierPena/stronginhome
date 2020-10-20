package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class imc extends AppCompatActivity {
    private TextView bajoPeso, normal,sobrepeso,obesidad,obesidadM,nombre;
    private float peso, estatura, imc;
    private RatingBar ratingBar;
    private EditText txPeso, txAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        txAltura = (EditText)findViewById(R.id.txtAltura);
        txPeso = (EditText)findViewById(R.id.txtPeso);
        nombre = findViewById(R.id.nombreUsuario);
        bajoPeso = findViewById(R.id.pesoBajo);
        normal = findViewById(R.id.normal);
        sobrepeso = findViewById(R.id.sobrepeso);
        obesidad = findViewById(R.id.obesidad);
        obesidadM = findViewById(R.id.obesidadM);
        txAltura.setText(Float.toString(formulario.person.getEstatura()));
        txPeso.setText(Integer.toString(formulario.person.getPeso()));
        peso = formulario.person.getPeso();
        estatura = formulario.person.getEstatura();
        imc =  peso / (estatura * estatura);
        nombre.setText(formulario.person.getNombre());

        ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(imc.this, "¡GRACIAS POR SU CALIFICACIÓN!", Toast.LENGTH_LONG).show();
            }
        });

        if (imc < 18.5){
            txPeso.setTextColor(Color.parseColor("#0277BD"));
            bajoPeso.setTextColor(Color.parseColor("#0277BD"));
        }if (imc >= 18.5 && imc < 25){
            txPeso.setTextColor(Color.parseColor("#4CAF50"));
            normal.setTextColor(Color.parseColor("#4CAF50"));
        }if (imc >= 25 && imc < 30){
            txPeso.setTextColor(Color.parseColor("#FFEB3B"));
            sobrepeso.setTextColor(Color.parseColor("#FFEB3B"));
        }if (imc >= 30 && imc < 35){
            txPeso.setTextColor(Color.parseColor("#F57F17"));
            obesidad.setTextColor(Color.parseColor("#F57F17"));
        }if (imc >= 35 && imc < 40){
            txPeso.setTextColor(Color.parseColor("#F44336"));
            obesidadM.setTextColor(Color.parseColor("#F44336"));
        }



    }
    public void home(View view){
        Intent intent = new Intent (getApplicationContext(), Ejercicios.class);
        formulario.person.setEstatura(Float.parseFloat(txAltura.getText().toString()));
        formulario.person.setPeso(Integer.valueOf(txPeso.getText().toString()));
        startActivity(intent);

    }
}