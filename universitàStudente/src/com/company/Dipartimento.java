package com.company;

public class Dipartimento {
    private String nome;
    private Facolta[]f;

    public Dipartimento(String nome, Facolta[] f) throws Exception {
        this.nome = nome;
        this.f = new Facolta[f.length];
        for(int i = 0; i < this.f.length; i++){
            this.f[i] = new Facolta(f[i]);
        }
    }

    public Dipartimento(Dipartimento d) throws Exception{
        this(d.nome,d.f);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome != null) {
            if (!nome.equals("")) {
                if (nome.length() == 2) {
                    this.nome = nome;
                } else {
                    throw new Exception("La facoltà deve areve due lettere");
                }
            } else {
                throw new Exception("Il nome non può essre euna stringa vuota");
            }
        } else {
            throw new Exception("Il nome non può essere null");
        }
    }

    public void addStudente(Studente s, String facolta)throws Exception{
        int i = findFacolta(facolta);
        if(i != -1){
            f[i].addStudente(s);
            s.setCodiceMatricola(nome+s.getCodiceMatricola());
        }else{
            throw new Exception("Indice non valido");
        }
    }

    public void addDocente(Docente d, String facolta) throws Exception{
        int i= findFacolta(facolta);
        if(i != -1){
            f[i].addDocente(d);
        }else{
            throw new Exception("Indice non valido");
        }
    }

    public boolean removeStudente(String fac, String codiceFiscale) throws Exception {
        int j = findFacolta(fac);
        if(j != -1){
            boolean b = false;
            int i = 0;
            while(i < f.length && !b)
                b = f[i].removeStudente(codiceFiscale);

            return b;
        }else
            throw new Exception("Non esiste la facoltà selezionata");
    }

    public boolean removeDocente(String fac, String codiceFiscale) throws Exception{
        int j = findFacolta(fac);
        if(j != -1){
            boolean b = false;
            int i = 0;
            while(i < f.length && !b)
                b = f[i].removeDocente(codiceFiscale);

            return b;
        }else
            throw new Exception("Non esiste la facoltà selezionata");
    }

    private int findFacolta(String nome){
        int i = 0;
        while(i < f.length && !f[i].getNome().equals(nome)){
            i++;
        }
        i = i == f.length ? -1 : i;
        return i;
    }

    public String info() {
        String out = "";
        out = "Nome del dipartimento: "+nome+"\n";
        for(int i = 0; i < f.length; i++){
            out+= f[i].info()+"\n";
        }
        return out;
    }
}