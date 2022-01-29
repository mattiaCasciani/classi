package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String semi[]={"bastoni", "denara", "spade", "coppe"};
        int numC=40;
        int numSemi=4;
        MazzoCarte m = new MazzoCarte(numC, semi, numSemi);
        Gioco g = new Gioco(numC, semi, numSemi);
        /*System.out.println(g.toString());
        System.out.println("\n");
        System.out.println(m.estraiCarta());
        System.out.println("\n");
        System.out.println(g.stampaM());*/
        int[] giocatori = {1, 2};
        double[] punteggio = {0.0, 0.0};
        boolean esci =false;
        for(int i=0; i< 2;i++){
            esci = false;
            while(!esci){
                System.out.println(m.estraiCarta());
                if(m.getValore()==0){
                    System.out.println("quale valore vuoi che assuma la carta? ");
                    punteggio[i] += scan.nextDouble();
                }else {
                    punteggio[i] += m.getValore();
                    System.out.println("punteggio: "+ punteggio[i]);
                }
                if(punteggio[i] > 7.5){
                    punteggio[i]=-1;
                    System.out.println("hai perso, sei andato fuori dal range");
                    esci = true;
                }
                if(!esci){
                    System.out.println("vuoi continuare? [s/n]");
                    char scelta = scan.nextLine().charAt(0);
                    if(scelta=='n')
                        esci = true;
                }

            }
        }
        int vincitore = 0;
        for(int i=0; i<giocatori.length-1;i++){
            if(punteggio[i]> punteggio[i+1]){
                vincitore= i;
            }else{
                if(punteggio[i]== punteggio[i+1])
                    vincitore=-1;
                else
                    vincitore = i+1;
            }
        }

        if(vincitore >-1){
            System.out.println("\nha vinto il giocatore: "+ giocatori[vincitore] + " con punteggio: " + punteggio[vincitore]);
        }else
            System.out.println("\npareggio!!");
    }
}
