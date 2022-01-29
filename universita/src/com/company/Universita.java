package com.company;

/**
 *
 * @author Mattia Casciani
 */
class Universita {

    private Facolta[] f;
    private String nome;

    /**
     * costruttore con parametri
     *
     * @param f
     * @param nome
     * @throws Exception
     */
    public Universita(Facolta[] f, String nome) throws Exception {
        this.f = new Facolta[11];
        for (int i = 0; i < f.length; i++)
            this.f[i] = new Facolta(f[i]);
        setNome(nome);
    }

    /**
     * metodo che aggiunge lo studente passato da parametro alla facoltà con
     * l'indice passato da parametro
     * @param s
     * @param i
     * @throws Exception
     */
    public void addStudente(Studente s, int i) throws Exception {
        if (s != null)
            f[i].add(s);
        else
            throw new Exception("lo studente non può essere null");
    }

    public String getNome() {
        return nome;
    }

    /**
     * metodo che modifica la variabile di istanza nome
     *
     * @param nome
     * @throws Exception
     */
    public void setNome(String nome) throws Exception {
        if (nome != null) {
            if (!nome.equals(""))
                this.nome = nome;
            else
                throw new Exception("il codice non può essere vuoto");
        } else
            throw new Exception("il codice fiscale non può essere null");
    }

    /**
     * metodo che rimuove lo studente data la matricola in input
     *
     * @param matricola
     * @throws Exception
     */
    public void removeStudente(int matricola) throws Exception {

        for (int i = 0; i < f.length; i++) {
            if (f[i] != null) {
                for (int j = 0; j < f[i].getStudenti().length; ++j) {
                    if (f[i].getStudenti()[j] != null && f[i].getStudenti()[j].getMatricola() == matricola)
                        f[i].delete(j);
                }
            }
        }
    }

    /**
     * metodo che stampa gli attributi della classe
     *
     * @return
     * @throws Exception
     */
    public String stampa() throws Exception {

        String text = "";
        for (int i = 0; i < f.length; i++) {
            if (f[i] != null)
                text += "\n" + f[i].stampa();
        }
        return text;
    }
}

