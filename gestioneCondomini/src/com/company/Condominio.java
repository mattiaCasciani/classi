package com.company;

import java.util.Arrays;

public class Condominio {
    String nome;
    String indirizzo;
    private Appartamento condomini[];
    private int dimF;
    int dimL;
    public Condominio(int dimF,Appartamento condomini[]){
        dimL=0;
        this.condomini=new Appartamento[dimF];
        this.dimF=dimF;
        for(int i=0;i<dimF;i++){
            this.condomini[i]=condomini[i];
            dimL++;
        }
    }

    public Condominio (Condominio c){
        this.nome=c.nome;
        this.indirizzo=c.indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String toString() {
        String testo="numero di appartamenti: "+dimF+"\n";
        for(int i=0;i<dimL;i++)
            testo += "\t"+condomini[i].toString()+"\n";
        return testo;
    }
}
