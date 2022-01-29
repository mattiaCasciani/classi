package com.company;

public class Gioco {
    private MazzoCarte m;

    public Gioco(int numC, String semi[], int numSemi) {
        m=new MazzoCarte(numC,semi, numSemi);
    }

    public String stampaM(){
        return m.stampaMazzo()+"\n";
    }



    public String toString(){
        return m.toString();
    }

}
