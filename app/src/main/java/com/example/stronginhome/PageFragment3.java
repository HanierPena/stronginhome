package com.example.stronginhome;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PageFragment3 extends Fragment {
    Button boton;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =  inflater.inflate(R.layout.page_3, container, false);
       boton = view.findViewById(R.id.button2);
       boton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(view.getContext(), Ejercicios.class);
               startActivity(intent);
           }
       });


        return view;

    }

    public void enviar(View view){

        Intent intent = new Intent(this.getContext(),Ejercicios.class);
        startActivity(intent);


    }



}
