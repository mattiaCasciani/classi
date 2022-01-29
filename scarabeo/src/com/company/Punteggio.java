package com.company;

public class Punteggio {
    private int []punti;

    public Punteggio(int[] punti) {
        this.punti = new int[punti.length];
        for(int i = 0; i < punti.length; i++){
            this.punti[i]=punti[i];
        }
    }

    public Punteggio(Punteggio point){
        this(point.punti);
    }

    public int[] getPunti() {
        return punti;
    }

    public int puntoLettera(char lettera)throws Exception{
        int point=0;
        int posLettera=lettera;
        if((lettera >= 97) && (int)lettera <=122)
            posLettera-=32;
        if((lettera >= 65) && (int)lettera <=90) {
            posLettera -= 65;
            point = punti[posLettera];
        }
        else
            throw new Exception("Carattere non valido");

        return point;
    }

    public String toString() {
        String out="";
        for(int i =0; i<punti.length; i++)
            out+="\tlettera "+(char)(i+65)+": "+punti[i];
        return out;
    }


}

