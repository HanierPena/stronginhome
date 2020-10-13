package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Ejercicios extends AppCompatActivity {

    private ArrayList<Rutinas> dataSetRutinas;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);



        recyclerView = (RecyclerView)findViewById(R.id.rvRutinas);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        dataSetRutinas = new ArrayList<Rutinas>();
        llenarDataSet();
        recyclerView.setAdapter(new AdapterRutinas(dataSetRutinas));



    }

    private void llenarDataSet(){
        dataSetRutinas.add(new Rutinas(R.drawable.calentamiento, "Ejercicio", "Calentamiento"));
        dataSetRutinas.add(new Rutinas(R.drawable.movilidad, "Ejercicio", "Movilidad"));
        dataSetRutinas.add(new Rutinas(R.drawable.fuerza, "Ejercicio", "Fuerza"));

    }
}