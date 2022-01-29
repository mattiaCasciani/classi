package com.company;

import java.util.Arrays;

public class Immagine {
    private Pixel matricePixel[][];

    public Immagine(Pixel matricePixel[][]){
        this.matricePixel=new Pixel[matricePixel.length][matricePixel[0].length];
        for(int i=0;i< matricePixel.length;i++){
            for(int k=0;k<matricePixel[0].length;k++)
                this.matricePixel[i][k]=matricePixel[i][k];
        }
    }

    public String toString() {
        String testo="";
        for(int i=0;i< matricePixel.length;i++){
            for(int k=0;k<matricePixel[0].length;k++)
                testo+="| "+matricePixel[i][k].toString() + " | ";
            testo+="\n";
        }
        return testo;
    }
}
