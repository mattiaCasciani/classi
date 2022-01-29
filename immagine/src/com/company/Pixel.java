package com.company;

public class Pixel {
    private String colore;
    private int trasparenza;

    public Pixel(String colore, int tarsparenza){
        this.colore=colore;
        this.trasparenza=tarsparenza;
    }

    public String toString() {
        return "colore=" + colore + "\t" +
                "trasparenza=" + trasparenza;
    }
}
