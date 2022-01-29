package com.company;

public class Universita {

    private int dimL;
    private Dipartimento[] dip;

    public Universita(int dimL, Dipartimento[] dip) throws Exception {
        this.dimL = dimL;
        dip = new Dipartimento[dip.length];
        for (int i = 0; i < dip.length; i++) {
            this.dip[i] = new Dipartimento(dip[i]);
        }
    }

    public int getDimL() {
        return dimL;
    }

    public void addStudente(String dipartimento, String facolta, Studente s, String maturita) throws Exception {
        int i = findDip(dipartimento);
        if (i != -1) {
            dip[i].addStudente(s, facolta);
        } else {
            throw new Exception("Il dipartimento non esiste");
        }

    }

    public boolean removeStudente(String cf, String dipartimento, String fac) throws Exception {
        int j = findDip(dipartimento);
        if (j != -1) {
            boolean b = false;
            int i = 0;
            while (i < dip.length && !b) {
                b = dip[i].removeStudente(fac, cf);
            }

            return b;
        } else {
            throw new Exception("Non esiste la facoltà selezionata");
        }
    }

    public void addDocente(Docente d, String dipartimento, String facolta, String matiruta) throws Exception {
        int i = findDip(dipartimento);
        if (i != -1) {
            dip[i].addDocente(d, facolta);
        } else {
            throw new Exception("Il dipartimento non esiste");
        }
    }

    public boolean removeDocente(String cf, String dipartimento, String fac) throws Exception {
        int j = findDip(dipartimento);
        if (j != -1) {
            boolean b = false;
            int i = 0;
            while (i < dip.length && !b) {
                b = dip[i].removeDocente(fac, cf);
            }

            return b;
        } else {
            throw new Exception("Non esiste la facoltà selezionata");
        }
    }

    private int findDip(String nome) {
        int i = 0;
        while (i < dip.length && !dip[i].getNome().equals(nome)) {
            i++;
        }
        i = i == dip.length ? -1 : i;
        return i;
    }

    public String info() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


}
