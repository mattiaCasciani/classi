package com.company;

public class Main {

    public static void main(String[] args) {
        Pixel img[][]={{new Pixel("000,000,255", 100), new Pixel("255,255,0",50)},{new Pixel("000,000,255", 100), new Pixel("255,255,0",50)}};
        Immagine i= new Immagine(img);
        System.out.println(i.toString());
    }
}
