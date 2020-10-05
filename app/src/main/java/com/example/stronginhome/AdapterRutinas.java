package com.example.stronginhome;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.view.LayoutInflaterCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

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
    public void onBindViewHolder(@NonNull ViewHolderCVRutinas holder, final int position) {
        final Rutinas rutina = dataSet.get(position);
        holder.titleRutina.setText(rutina.getTitle());
        holder.ivRutina.setImageResource(rutina.idRecurso);
        holder.seleccionar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ejercicioAccion.class);
                intent.putExtra(ejercicioAccion.RUTINA, rutina.getTitle());
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
        private TextView titleRutina;
        private ImageButton seleccionar;

        public ViewHolderCVRutinas(View view){
            super(view);
            ivRutina = (ImageView) view.findViewById(R.id.ivCvRutina);
            titleRutina = (TextView) view.findViewById(R.id.tvTituloRutina);
            seleccionar = (ImageButton)view.findViewById(R.id.fabSeleccionar);


        }
    }
}
