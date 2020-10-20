package com.example.stronginhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class ejercicioAccion extends AppCompatActivity {

    private int seconds = 30;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String  rutina = intent.getStringExtra("rutina");

        if(rutina.equals("Calentamiento")){
            setContentView(R.layout.activity_ejercicio_calentamiento);
        }else if(rutina.equals("Movilidad")){
            setContentView(R.layout.activity_ejercicios_movilidad);
        }else if(rutina.equals("Fuerza")){
            setContentView(R.layout.activity_ejercicios_fuerza);
        }


        if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
        }

        runTimer();
    }

    public void onClickStart(View view){
        running = true;

    }

    public void onClickStop(View view){
        running = false;

    }

    public void onClickReset(View view){
        running = false;
        Intent intent = new Intent (getApplicationContext(), imc.class);
        startActivity(intent);
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running",running);
    }

    private void runTimer(){
        final TextView timeView=(TextView)findViewById(R.id.tvTiempo);
        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                /*int hours = seconds/3600;
                int minute = (seconds%3600)/60;*/
                int sec =seconds %60;   /*buscar el calculo para solo los 30 seg*/
                String time = String.format("%02d"+" Seg", sec); //hours, minute
                timeView.setText(time);
                if(running){
                    seconds--;
                    if(seconds == 0){

                        Intent intent = new Intent (getApplicationContext(), imc.class);
                        startActivity(intent);

                    }
                }
                handler.postDelayed(this,1000);

            }
        });
    }

}