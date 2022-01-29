package com.company;

import java.util.Arrays;

public class Gestione {
    private String pIVA;
    private Condominio condomini[];

    public Gestione(String pIVA, Condominio condomini[]){
        this.pIVA=pIVA;
        this.condomini=new Condominio[condomini.length];
        for(int i=0;i<condomini.length;i++)
            this.condomini[i]=condomini[i];
    }


    public String toString() {
        String testo="pIVA: "+pIVA+ "\tnumero condomini: "+condomini.length+":\n";
        for (int i=0;i< condomini.length;i++)
            testo+="\t"+condomini[i].toString()+"\n";
        return testo;
    }
}
