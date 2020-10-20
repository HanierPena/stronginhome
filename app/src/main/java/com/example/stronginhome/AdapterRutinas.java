package com.example.stronginhome;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRutinas extends RecyclerView.Adapter<AdapterRutinas.ViewHolderCVRutinas>{
    private ArrayList<Rutinas> dataSet;

    public AdapterRutinas(ArrayList<Rutinas> datos){
        dataSet=datos;
    }

    @NonNull
    @Override
    public ViewHolderCVRutinas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_rutina,parent,false);
        return new ViewHolderCVRutinas(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolderCVRutinas holder, final int position) {

        final Rutinas rutina = dataSet.get(position);

        holder.ivRutina.setImageResource(rutina.idRecurso);
        holder.titleEjercicio.setText(rutina.getTitleEjer());
        holder.titleRutina.setText(rutina.getTitleRutina());
        holder.seleccionar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),info_ejercicio.class);
                intent.putExtra("rutina", holder.titleRutina.getText().toString());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolderCVRutinas extends  RecyclerView.ViewHolder {
        private ImageView ivRutina;
        private TextView titleEjercicio;
        private TextView titleRutina;
        private Button seleccionar;

        public ViewHolderCVRutinas(View view){
            super(view);
            ivRutina = (ImageView) view.findViewById(R.id.ivCvRutina);
            titleEjercicio = (TextView) view.findViewById(R.id.tvEjercicio);
            titleRutina = (TextView) view.findViewById(R.id.tvTituloRutina);
            seleccionar = (Button)view.findViewById(R.id.btnEmpezar);


        }
    }
}
