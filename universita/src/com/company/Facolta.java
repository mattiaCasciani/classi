package com.company;

/**
 *
 * @author Mattia Casciani
 */
class Facolta{

    private Studente [] studenti;
    private int dimL;
    private String nome;


    /**
     * costruttore con parametri
     * @param nome
     * @throws Exception
     */
    public Facolta(Studente []s,String nome) throws Exception{
        this.nome = nome;
        studenti = new Studente [s.length];
        dimL = studenti.length;
        for(int i = 0; i< s.length; i++){
            studenti[i] = new Studente(s[i]);
        }


    }

    /**
     * costruttore con un oggetto di tipo facolta come parametro
     * @param f
     */

    public Facolta(Facolta f){
        this.nome = f.nome;
        this.dimL = f.dimL;
        this.studenti = new Studente[dimL];
        for(int i = 0; i < dimL; i++){
            if(f.studenti[i] != null){
                this.studenti[i] = f.studenti[i];
            }

        }

    }

    public Facolta(){
        dimL++;
    }

    /**
     *
     * @return studente di indice i
     */

    public String getNome() {
        return nome;
    }

    /**
     * metodo che modifica la variabile d'istanza del nome
     * @param nome
     * @throws Exception
     */

    public void setNome(String nome)throws Exception {
        if(nome != null){
            if(!nome.equals("")){
                this.nome = nome;
            }else
                throw new Exception("il codice fiscale non può essere vuoto");
        }else
            throw new Exception("il codice fiscale non può essere null");
    }

    public int getDimL() {
        return dimL;
    }

    public Studente[] getStudenti() {
        return studenti;
    }



    /**
     * metodo che aggiunge lo studente (parametro) nel primo posto libero
     * @param s
     * @throws Exception
     *
     */
    public void add(Studente s) throws Exception {
        if(dimL==studenti.length){
            resize();
        }
        int i = firstFree();
        if(s != null){
            this.studenti[i] = new Studente(s);
            dimL++;
        }else{
            throw new Exception("lo studente non può essere null");
        }




    }

    /**
     * metodo per l'aumento della dimensione dell'array studenti
     * @throws Exception
     */
    private void resize() throws Exception{
        Studente [] s = new Studente[studenti.length*2];
        for(int i = 0; i < studenti.length; i++){
            s[i] = new Studente(studenti[i]);
        }
        studenti = s;
    }


    /**
     * metodo che elimina lo studente di posizione index passata da parametro
     * @param index
     * @throws Exception
     */
    public void delete(int index) {
        if(index < studenti.length){
            studenti[index] = null;
            dimL--;
        }


    }

    /**
     * metodo che ritorna la prima posizione libera nell'array di studenti
     * @return
     */
    private int firstFree(){
        int i = 0;
        while (i < studenti.length && studenti[i] != null)
            i++;
        if(i == studenti.length)
            i = -1;
        return i;
    }


    /**
     * metodo che stampa gli attributi della classe
     * @return
     * @throws Exception
     */
    public String stampa() throws Exception{
        String text = "";

        for(int i = 0; i < studenti.length; i++) {
            if(studenti[i] != null)
                text+="\nStudente "+(i+1)+":  "+studenti[i].stampa();
        }
        text+="\nDimensione logoca:  "+dimL+"\nFacoltà:  "+nome;

        return text;
    }
}


