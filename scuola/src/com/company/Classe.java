package com.company;

import java.util.Arrays;

public class Classe {
    private String nome;
    private String aula;
    private int nAlunni;
    private Studente alunni[];

    public Classe(String nome, String aula, int nAlunni, Studente alunni[]){
        this.alunni= new Studente[nAlunni];
        this.nome=nome;
        this.aula=aula;
        this.nAlunni=nAlunni;
        for(int i=0;i<nAlunni;i++)
            this.alunni[i]=alunni[i];
    }

    public String toString() {
        String testo="nome: "+nome+"\taula: "+aula+"\tnumero alunni: "+nAlunni+"\n";
        for(int i=0;i<nAlunni;i++)
            testo+=alunni[i].toString()+"\n";
        return  testo;
    }
}
