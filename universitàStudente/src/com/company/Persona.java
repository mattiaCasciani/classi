package com.company;

public class Persona {
    private String cognome;
    private String nome;
    private String codiceFiscale;
    private String dataDiNascita;

    public Persona(String cognome, String nome, String codiceFiscale, String dataDiNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.dataDiNascita = dataDiNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String info(){
        return "\nCognome: "+cognome+"\nNome: "+nome+"\nCodice fiscale: "+codiceFiscale
                +"\nData di nascita: "+dataDiNascita;
    }
}


