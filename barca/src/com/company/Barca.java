package com.company;

public class Barca {
    private String  nomeBarca;
    private String  nazionalita;
    private Double  lunghezza;
    private Integer stazza;
    private String  tipologia; //vela o motore

    public Barca(String nomeBarca, String nazionalita, Double lunghezza, Integer stazza, String tipologia) {
        this.nomeBarca  = nomeBarca;
        this.nazionalita= nazionalita;
        this.lunghezza  = lunghezza;
        this.stazza     = stazza;
        this.tipologia  = tipologia;
    }

    public Barca(Barca barca){
        this.nomeBarca  = barca.nomeBarca;
        this.nazionalita= barca.nazionalita;
        this.lunghezza  = barca.lunghezza;
        this.stazza     = barca.stazza;
        this.tipologia  = barca.tipologia;
    }

    public String getNomeBarca() {
        return nomeBarca;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public int getStazza() {
        return stazza;
    }

    public String getTipologia() {
        return tipologia;
    }

    //metodi set

    public String infoBarca(){
        String info = "nome: " + nomeBarca +
                "\nnazionalita: " + nazionalita +
                "\nlunghezza: " + lunghezza +
                "\nstazza: " + stazza +
                "\ntipologia: " + tipologia;
        return info;
    }
}

