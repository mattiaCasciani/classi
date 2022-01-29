package com.company;

public class Partita {
    private int thisPlayer;
    private int missingObject;
    private int[] punteggio;
    private String[] summon;
    private Oggetto[][] tabellone;
    private String messageAfterPick;

    /**
     * costruttore con righe>4 per via del numero di oggetti da inserire.
     * @param nPlayer numero di giocatori, deve essere uno o più
     * @param nRighe numero di righe --> N
     * @param nColonne numero di colonne --> M
     * @throws Exception se i valori non sono validi per una partita
     */

    public Partita(int nPlayer, int nRighe, int nColonne)throws Exception{
        if(nRighe*nColonne<nRighe*4)
            throw new Exception("Il valore delle righe e o delle colonne è troppo basso");
        if(nPlayer<1)
            throw new Exception("Numero di giocatori non valido");
        punteggio=new int[nPlayer];
        //il numero massimo di pescate è uguale al numero di oggetti, creo già l'array di quella dimensione, così no va più ridimensionato
        summon=new String[nRighe*4];
        tabellone=new Oggetto[nRighe][nColonne];
        thisPlayer=0;
        missingObject=nRighe*4;
        //aggiungo tutti gli oggetti al tabellone, in posizioni casuali
        for(int i=0;i<nRighe;i++){
            aggiungi(new Oggetto(1,"matita"));
            aggiungi(new WithMalus(1,5,"forbici"));
            //questi oggetti hanno un oggetto diverso(lo aggiungo una volta all'inizio
            if(i==0){
                aggiungi(new Oggetto(-1,"gomma rossa"));
                aggiungi(new Oggetto(5,"penna stilografica"));
            }else{
                aggiungi(new Oggetto(2,"gomma"));
                aggiungi(new Oggetto(4,"penna"));
            }
        }
    }

    /**
     * ritorna num giocatore in base all'array (da pos. 0 a pos. array.lenght-1)
     * @return thisPlayer--> giocatore corrente
     */

    public int getThisPlayer(){

        return thisPlayer;
    }

    /**
     * punteggio del giocatore indicato
     * @param player numero del giocatore: 0->nGIocaotri-1
     * @return punteggio del giocaotore
     */

    public int getPunteggio(int player){
        return punteggio[player];
    }

    /**
     * controllo tramite il numero di oggetti mancanti se la partita è finita
     * @return se la partita è finita
     */

    public boolean isEnded(){
        return missingObject==0;
    }

    /**
     * metodo privato per aggiungere il una posizione casuale l'oggetto inserito, non controlla se c'è spazio
     * @param in oggetto da inserire
     */

    private void aggiungi(Oggetto in){
        int x;
        int y;
        //continua finchè non trova una cella vuota
        do{
            x=(int)(Math.random()* tabellone[0].length);
            y=(int)(Math.random()* tabellone.length);
        }while(tabellone[y][x]!=null);
        tabellone[y][x]=in;
    }

    /**
     * metodo principale del gioco, il giocatore corrente controlla il contenuto della cella,
     * cambia giocatore solo se la cella era valida e piena
     * @param x colonna x della cella
     * @param y riga della cella
     * @return true se la pescata è andata a buon fine
     */

    public boolean pick(int x,int y){
        boolean out=false;
        if (isEnded()) {
            messageAfterPick="partita finita, non ci sono più oggetti da trovare";
        } else {
            //controllo input
            if (x < 0 || x >= tabellone[0].length || y < 0 || y >= tabellone.length) {
                messageAfterPick="coordinate non valide";
            } else {
                Oggetto picked = tabellone[y][x];
                //controllo se la cella era piena
                if (picked == null) {
                    out=true;
                    messageAfterPick="non hai pescato niente";
                } else {
                    //controllo che la cella non sia già stata pescata
                    if (picked.getPunti() == 0) {
                        messageAfterPick = "cella già controllata";
                    } else {
                        //aggiungo alla lista delle pescate l'oggetto corrente, modifico tutti i valori da modificare
                        summon[tabellone.length * 4 - missingObject] = picked.getNome();
                        missingObject--;
                        punteggio[thisPlayer] += picked.getPunti();
                        tabellone[y][x] = new Oggetto(0, "");//oggetto vuoto, vuol dire che la cella è già stata controllata
                        //controllo se la cella aveva un malus, se sì lo applico a tutti gli altri giocatori
                        if (picked instanceof WithMalus) {
                            for (int i = 0; i < punteggio.length; i++) {
                                if (i != thisPlayer)
                                    punteggio[i] -= ((WithMalus) picked).getMalus();
                            }
                        }
                        //passo al giocatore successivo, se il giro è finito lo reincomincio
                        thisPlayer = (thisPlayer + 1) % punteggio.length;
                        out = true;
                        messageAfterPick = "pescata: " + picked.getNome();
                    }
                }
            }
        }
        return out;
    }

    /**
     * metodo che ritorna la cronologia delle mosse nell'ordine corretto
     * @return out
     */

    public String[] getSummon(){
        String[] out=new String[tabellone.length*4-missingObject];
        for (int i = 0; i < out.length; i++)
            out[i]=summon[i];
        return out;
    }

    /**
     * metodo che ritorna il messaggio relativo all'ultima pescata
     * @return esito dell'ultima pescata
     */

    public String getmessageAfterPick(){
        return messageAfterPick;
    }

    /**
     * Metodo che stampa le caratteristiche della classe
     * @return stampa
     */

    public String toString(){
        String out="Punteggio giocatori: \n";
        for (int i = 0; i < punteggio.length; i++)
            out+= "giocatore "+i+": "+punteggio[i]+"\n";
        out+="giocatore corrente: "+thisPlayer+"\n";
        if(isEnded()){
            out+="partita finita, pescate in ordine: \n";
            for (String pescata: summon) {
                out+=pescata+"\n";
            }
        }else{
            out+="partita in corso, numero di oggetti da trovare: "+missingObject;
        }
        return out;
    }

    /**
     * metodo per controllare il vincitore
     * @return massimo--> indice del giocatore che ha vinto
     * @throws Exception se la partita non è finita
     */
    public int getWinner() throws Exception{
        if(!isEnded())
            throw new Exception("La partita non è terminata");
        int massimo=0;
        for (int i = 1; i < punteggio.length; i++){
            if(punteggio[i]>punteggio[massimo])
                massimo=1;
        }


        return massimo;
    }
}