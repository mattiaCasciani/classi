package com.company;


public class Facolta {

    private String nome;
    private Persona[] studenti;
    private Persona[] docenti;

    public Facolta(String nome, int posti, Persona[] studenti, Persona[] docenti) throws Exception {
        setNome(nome);
        this.studenti = new Studente[posti];
        this.docenti = new Docente[posti];

    }

    public Facolta(Facolta f) throws Exception {
        setNome(f.nome);
        this.docenti = f.docenti;
        this.studenti = f.studenti;
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

    public String getNome() {
        return nome;
    }

    public void addStudente(Studente s) throws Exception {
        int i = firstFreeS();
        if (i != -1) {
            Studente s1 = new Studente(s);
            s1.setCodiceMatricola(s.getCodiceMatricola());
            studenti[i] = new Studente(s1);
        }else{
            throw new Exception("Indice non valido");
        }
    }

    public void addDocente(Docente d) throws Exception {
        int i = firstFreeD();
        if (i != -1) {
            docenti[i] = new Docente(d);
        }

    }



    public boolean removeStudente(String codiceFiscale) throws Exception {
        int i = 0;
        if (codiceFiscale != null) {
            if (!codiceFiscale.equals("")) {

                while (i < studenti.length && studenti[i] != null && !studenti[i].getCodiceFiscale().equals(codiceFiscale)) {
                    i++;
                }
                if (i == studenti.length) {
                    throw new Exception("Il codice fiscale non rappresenta una persona");
                } else {
                    studenti[i] = null;
                }
            } else {
                throw new Exception("il codice fiscale inserito è una stringa vuota");
            }

        } else {
            throw new Exception("Il codice fiscale inserito è null");
        }
        return docenti[i] == null;
    }

    public boolean removeDocente(String codiceFiscale) throws Exception {
        int i = 0;
        if (codiceFiscale != null) {
            if (!codiceFiscale.equals("")) {

                while (i < docenti.length && !docenti[i].getCodiceFiscale().equals(codiceFiscale)) {
                    i++;
                }
                if (i == docenti.length) {
                    throw new Exception("Il codice fiscale non rappresenta una persona");
                } else {
                    docenti[i] = null;
                }
            } else {
                throw new Exception("il codice fiscale inserito è una stringa vuota");
            }

        } else {
            throw new Exception("Il codice fiscale inserito è null");
        }
        return docenti[i] == null;
    }

    private int firstFreeS() {
        int i = 0;
        while (i < studenti.length && studenti[i] != null) {
            i++;
        }

        i = i == studenti.length ? -1 : i;
        return i;
    }

    private int firstFreeD() {
        int i = 0;
        while (i < docenti.length && docenti[i] != null) {
            i++;
        }

        i = i == docenti.length ? -1 : i;
        return i;
    }

    public String info() {
        String out = "Nome della facoltà: " + nome;
        String out1 = "";
        for (int i = 0; i < docenti.length; i++) {
            if (docenti[i] != null) {
                out += docenti[i].info()+"\n";
            }

        }

        for(int i= 0; i<studenti.length; i++){
            if(studenti[i] != null)
                out1 += studenti[i].info()+"\n";
        }
        return out + out1;
    }

}
