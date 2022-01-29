package com.company;

public class Studente {
    private String nominativo;
    private int ggNascita;
    private int mmNascita;
    private int aaNascita;

    public Studente(String nominativo, int ggNascita, int mmNascita, int aaNascita){
        this.nominativo=nominativo;
        this.ggNascita=ggNascita;
        this.mmNascita=mmNascita;
        this.aaNascita=aaNascita;
    }

    public String toString() {
        return "Studente{" +
                "nominativo='" + nominativo + '\'' +
                ", ggNascita=" + ggNascita +
                ", mmNascita=" + mmNascita +
                ", aaNascita=" + aaNascita +
                '}';
    }
}
