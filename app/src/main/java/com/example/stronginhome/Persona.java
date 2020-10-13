package com.example.stronginhome;

public class Persona {
    static String nombre, genero;
    static int peso, edad;
    static float estatura;


    public Persona(String nombre, String genero, int peso, int edad, float estatura) {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona(){

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
}
