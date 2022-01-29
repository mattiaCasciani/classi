package com.company;

public class Scarabeo {

    private Punteggio point;

    public Scarabeo(Punteggio point) {
        this.point = new Punteggio(point);
    }

    public Scarabeo(Scarabeo s) {
        this(s.point);
    }

    public Punteggio getPoint() {
        return point;
    }

    int puntiParola(String parola) throws Exception {
        int punti = 0;
        int length=parola.length();
        if (length < 2)
            throw new Exception("Parola troppo corta");
        else if (length > 8)
                throw new Exception("Parola troppo lunga");
        else if (parola.equals("SCARABEO"))
                    punti = 100;
        else {
            for (int i = 0; i < length; i++)
                punti += point.puntoLettera(parola.charAt(i));
            if(length>5)
                punti+=(length-6)*20+10;
        }
        return punti;
    }

    public int puntiParole(String[] parole)throws Exception{
        int punteggio=0;
        for(int i = 0; i< parole.length; i++){
            punteggio+=puntiParola(parole[i]);
        }
        return punteggio;
    }

    public String toString() {
        return ""+point;
    }

}

