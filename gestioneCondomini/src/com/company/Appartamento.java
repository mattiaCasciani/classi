package com.company;

public class Appartamento {
    private String nominativo;
    private int millesimi;
    private int numero;
    public Appartamento(String nominativo, int millesimi, int numero){
        this.nominativo=nominativo;
        this.millesimi=millesimi;
        this.numero=numero;
    }

    public Appartamento(Appartamento a){
        this.nominativo=a.nominativo;
        this.millesimi=a.millesimi;
        this.numero=a.numero;
    }

    public int getNumero() {
        return numero;
    }

    public int getMillesimi() {
        return millesimi;
    }

    public String getNominativo() {
        return nominativo;
    }

    public String toString() {
        return  "\tnumero appartamento: " + numero + '\t'+
                "nominativo: " + nominativo + '\t' +
                "millesimi: " + millesimi;
    }
}
