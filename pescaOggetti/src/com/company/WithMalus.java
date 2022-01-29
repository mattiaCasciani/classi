package com.company;

public class WithMalus extends Oggetto{
    private int malus;
    public WithMalus(int punti, int malus, String nome){
        super(punti,nome);
        this.malus=malus;
    }
    public int getMalus(){
        return malus;
    }
}