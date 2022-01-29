package com.company;


/**
 *
 * @author Mattia Casciani
 */
class Studente {

    private String nome;
    private String cognome;
    private String dataDiNascita;
    private String codiceFiscale;
    private int matricola;
    private static int numMatricole;

    /**
     * costruttore con parametri
     * @param nome
     * @param cognome
     * @param dataDiNascita
     * @param codiceFiscale
     * @throws Exception
     */
    public Studente(String nome, String cognome, String dataDiNascita, String codiceFiscale) throws Exception {
        setNome(nome);
        setCognome(cognome);
        setCodiceFiscale(codiceFiscale);
        setDataDiNascita(dataDiNascita);
        numMatricole++;
        matricola = numMatricole;
    }

    /**
     * costruttore con un oggetto di tipo studente passato da parametro
     * @param s
     * @throws Exception
     */

    public Studente(Studente s) throws Exception{
        this(s.nome, s.cognome, s.dataDiNascita, s.codiceFiscale);
        this.matricola= s.matricola;
        numMatricole--;
    }

    /**
     *  metodo che dopo aver verificato la validità del nome, lo assegna all'attributo nome
     * @param nome
     * @throws Exception
     */
    public void setNome(String nome) throws Exception {
        if(nome != null)
            if(!nome.equals(""))
                this.nome = nome;
            else
                throw new Exception("Nome non può vuoto");
        else
            throw new Exception("Nome non può essere null");
    }

    /**
     * metodo che dopo aver verificato la validità del cognome, lo assegna all'attributo cognome
     * @param cognome
     * @throws Exception
     */
    public void setCognome(String cognome) throws Exception {
        if(cognome != null)
            if(!cognome.equals(""))
                this.cognome = cognome;
            else
                throw new Exception("il cognome non può essere vuoto");
        else
            throw new Exception("il cognome non può essere null");
    }

    /**
     * metodo che dopo aver verificato la validità della data di nascita viene assegnata all'attributo
     * @param dataDiNascita
     * @throws Exception
     */

    public void setDataDiNascita(String dataDiNascita) throws Exception {
        if(dataDiNascita != null){
            if(!dataDiNascita.equals(""))
                this.dataDiNascita = dataDiNascita;
            else
                throw new Exception("la data di nascita non può contenere nessun dato");
        }else
            throw new Exception("la data di nascita non può essere null");
    }

    /**
     * metodo che dopo aver verificato che il codice fiscale rispetti le condizioni, lo assegna alla matricola
     * @param codiceFiscale
     * @throws Exception
     */

    public void setCodiceFiscale(String codiceFiscale) throws Exception {
        if(codiceFiscale != null){
            if(!codiceFiscale.equals("")){
                if(codiceFiscale.length()==13)
                    this.codiceFiscale = codiceFiscale;
                else
                    throw new Exception("il codice fiscale deve avere 13 caratteri");
            }else
                throw new Exception("il codice fiscale non può essere vuoto");
        }else
            throw new Exception("il codice fiscale non può essere null");
    }

    public int getMatricola() {
        return matricola;
    }



    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    /**
     * metodo per stampare gli attributi della classe
     * @return
     * @throws Exception
     */
    public String stampa() throws Exception{
        String text = "";
        if(nome == null || cognome == null || dataDiNascita == null || codiceFiscale == null){
            throw new Exception("attributi non validi, sono null");
        }else{
            text+="\nCognome:  "+cognome+"\nNome:  "+nome+"\nData di nascita:  "+dataDiNascita+ "\nCodice fiscale:  "+codiceFiscale+"\nmatricola:  "+matricola;
        }
        return text;
    }
}


