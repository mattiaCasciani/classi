package com.company;

public class Figlio extends Padre{
    private String ff;
    public Figlio(){
        ff="figlio";
    }

    public String getFf() {
        return ff;
    }

    public void setFf(String ff) {
        this.ff = ff;
    }

    public void incrementa(){
        ff="ho modificato il metodo padre";
    }

    @Override
    public String toString() {
        return "Figlio{" +
                "ff='" + ff + '\'' +
                '}';
    }
}
