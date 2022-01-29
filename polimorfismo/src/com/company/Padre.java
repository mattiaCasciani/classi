package com.company;

public class Padre {
    private int pp;

    public Padre(int pp){
        this.pp=pp;
    }

    public Padre(){}

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    public void incrementa(){
        pp++;
    }

    @Override
    public String toString() {
        return "Padre{" +
                "pp=" + pp +
                '}';
    }
}
