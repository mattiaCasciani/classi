package com.company;

public class Docente extends Persona{
    private String titoloLaurea;
    private Integer tipoProf; // indica con un numero da uno a tre la tipologia del professore (associato, ordinario, a contratto)

    public Docente(String titoloLaurea, Integer tipoProf, String cognome, String nome, String codiceFiscale, String dataDiNascita) {
        super(cognome, nome, codiceFiscale, dataDiNascita);
        this.titoloLaurea = titoloLaurea;
        this.tipoProf = tipoProf;
    }

    public Docente(Docente d){
        super(d.getCognome(),d.getNome(),d.getCodiceFiscale(),d.getDataDiNascita());

    }

    public String getTitoloLaurea() {
        return titoloLaurea;
    }

    public void setTitoloLaurea(String titoloLaurea) {
        this.titoloLaurea = titoloLaurea;
    }

    public Integer getTipoProf() {
        return tipoProf;
    }

    public void setTipoProf(Integer tipoProf) {
        this.tipoProf = tipoProf;
    }



    public String info(){
        return "\ntitoloLaurea: "+titoloLaurea+"\ntipoProf: "+tipoProf+super.info();
    }
}