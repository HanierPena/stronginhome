package com.example.stronginhome;

public class Rutinas {
    int idRecurso;
    String titleEjer;
    String titleRutina;


    public  Rutinas(int idRecurso, String titleEjer, String titleRutina){
        this.titleEjer=titleEjer;
        this.titleRutina=titleRutina;
        this.idRecurso=idRecurso;
    }

    public String getTitleEjer() {
        return titleEjer;
    }

    public String getTitleRutina() {
        return titleRutina;
    }

    public int getIdRecurso() {
        return idRecurso;
    }
}
