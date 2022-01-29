package com.company;

public class MazzoCarte {
    private int[] mazzo;
    private int numeroCarte;
    private String[] semeScritto;

    public MazzoCarte(int numC, String semi[], int numSemi){
        mazzo = new int[numC];
        semeScritto = new String[numSemi];
        for(int i=0;i<numSemi;i++){
            semeScritto[i]=semi[i];
            numeroCarte=0;
        }
        caricaMazzo();
    }

    private void caricaMazzo(){
        boolean[][] carte= new boolean[semeScritto.length][(mazzo.length/semeScritto.length)];
        int i=0, valore, seme;
        while (i<mazzo.length){
            valore= (int) (Math.random()*(mazzo.length/semeScritto.length)+1);
            seme = (int) (Math.random()*4);
            if(!carte[seme][valore-1]){
                mazzo[i]= (seme*100)+valore;
                carte[seme][valore-1]=true;
                i++;
            }
        }
        numeroCarte=mazzo.length;
    }

    public String estraiCarta(){
        String carta=(mazzo[0]-(mazzo[0]/100)*100) + " di " + semeScritto[(mazzo[0]/100)];
        shift(0);
        return carta;
    }

    private void shift(int index){
        for(int i=index;i< mazzo.length-1;i++){
            mazzo[i]=mazzo[i+1];
        }
        mazzo[numeroCarte-1]=0;
        numeroCarte--;
    }

    public String stampaMazzo(){
        String testo="";
        for(int i =0;i<numeroCarte; i++){
            testo += (int)(mazzo[i]-((mazzo[i]/100)*100)) + " di " + semeScritto[mazzo[i]/100] + "\n";
        }
        return testo;
    }

    public double getValore(){
        if(mazzo[0]!= 110) {
            if(mazzo[0]-((mazzo[0]/100)*100)>7){
                return 0.5;
            }else
                return (mazzo[0]-(int)((mazzo[0]/100)*100));
        }else
            return 0;
    }

    public String toString(){
        String testo="";
        for(int i=0;i<mazzo.length;i++)
            testo += mazzo[i] + "\n";
        for(int i=0;i<semeScritto.length;i++)
            testo += semeScritto[i] + "\n";
        testo += numeroCarte;
        return testo;
    }
}
