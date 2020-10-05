package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class messagePrevention extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_prevention);
    }

     public void mostrarFormulario(View view){
         Intent intent = new Intent(this, formulario.class);
         startActivity(intent);
     }
}