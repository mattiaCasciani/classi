package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
    	System.out.println("inserire la dimensione del vettore: ");
	    int dimF = scan.nextInt();
	    ArrayNumero a1 = new ArrayNumero(dimF);
	    boolean exit=false;
	    while(!exit){
	        System.out.println("inserire un numero: ");
	        int num = scan.nextInt();
	        System.out.println("se esce false il numero non sarà inserito, se esce true l'inserimento è finito con successo.\n" + a1.add(num));
	        System.out.println("il vettore quindi è:\n" + a1.stampa());
	        System.out.println("scrivere ''si'' per continuare, ''no'' per uscire> ");
	        String risp = scan.nextLine();
	        if(risp.equals("si")){
	            exit=true;
            }
        }
    }
}
