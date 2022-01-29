package com.company;

public class Oggetto {
    private int punti;
    private String nome;

    public Oggetto(int punti, String nome){
        this.punti=punti;
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public int getPunti(){
        return punti;
    }
}