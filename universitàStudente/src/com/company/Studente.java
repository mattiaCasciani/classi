package com.company;

public class Studente extends Persona{
    private String codiceMatricola;
    private String tipoMaturità;
    private Integer annoImm;
    private Integer annoLaurea;
    private static int mat;

    public Studente(String tipoMaturità, Integer annoImm, Integer annoLaurea, String cognome, String nome, String codiceFiscale, String dataDiNascita) {
        super(cognome, nome, codiceFiscale, dataDiNascita);
        this.tipoMaturità = tipoMaturità;
        this.annoImm = annoImm;
        this.annoLaurea = annoLaurea;
        mat++;
        codiceMatricola=""+mat+"AAAA";
    }

    public Studente(Studente s){
        super(s.getCognome(),s.getNome(),s.getCodiceFiscale(),s.getDataDiNascita());
        this.codiceMatricola = s.codiceMatricola;
        this.tipoMaturità = s.tipoMaturità;
        this.annoImm = s.annoImm;
        this.annoLaurea = s.annoLaurea;
        mat++;
        codiceMatricola=""+mat;
    }

    public Studente() {
        super(null, null, null, null);
        mat++;
        codiceMatricola=""+mat;
    }


    public String getCodiceMatricola() {
        return codiceMatricola;
    }

    public void cambiaCodiceMatricola(String ultimeLettere) {
        int primaLettera=codiceMatricola.length()-4;
        int k=0;
        if(codiceMatricola.length() >=5 && codiceMatricola.charAt(primaLettera) <=90 && codiceMatricola.charAt(primaLettera)>=65)
            for(int i=primaLettera;i<codiceMatricola.length();i++){
                codiceMatricola.replace(codiceMatricola.charAt(i), ultimeLettere.charAt(k));
                k++;
            }
        else
            codiceMatricola += ultimeLettere;
    }

    public void setCodiceMatricola(String codiceMatricola){
        this.codiceMatricola=codiceMatricola;
    }

    public String getTipoMaturità() {
        return tipoMaturità;
    }

    public void setTipoMaturità(String tipoMaturità) {
        this.tipoMaturità = tipoMaturità;
    }

    public Integer getAnnoImm() {
        return annoImm;
    }

    public void setAnnoImm(Integer annoImm) {
        this.annoImm = annoImm;
    }

    public Integer getAnnoLaurea() {
        return annoLaurea;
    }

    public void setAnnoLaurea(Integer annoLaurea) {
        this.annoLaurea = annoLaurea;
    }

    public String info() {
        return "\ncodiceMatricola: "+codiceMatricola+"\ntipoMaturità: "+tipoMaturità+"\nannoImm: "+annoImm+
                "\nannoLaurea: "+annoLaurea+super.info();
    }

}
