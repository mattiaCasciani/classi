package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayInt a1 = new ArrayInt(10);
        System.out.println(a1.toString());

        boolean bool=false;
        while (!bool){
            System.out.println("se esce true l'array e' completamente pieno: " + a1.isFull());
            System.out.println("dimensione logica: " + a1.size());
            System.out.println("inserire il valore: ");
            int v = scan.nextInt();
            System.out.println(a1.add(v));
            System.out.println(a1.toString());
            System.out.println("finire di inserire? 1 per si 0 per no");
            int exit= scan.nextInt();
            if(exit==1){
                bool=true;
            }
        }
        System.out.println("inserire l'elemento da verificare che sia presente nel vettore: ");
        int v=scan.nextInt();
        System.out.println(a1.indexOf(v) + a1.lastIndexOf(v));
        System.out.println("inserire l'indice da cui partire: ");
        int fromIndex = scan.nextInt();
        System.out.println("inserire l'indice da cui partire: ");
        int toIndex = scan.nextInt();
        for(int i=0;i<(toIndex-fromIndex);i++){
            System.out.println(a1.subList(fromIndex, toIndex)[i] + "\t");
        }
        System.out.println("inserire la posizione dell'elemento da togliere: ");
        int index = scan.nextInt();
        System.out.println("il valore tolto e': " + a1.remove(index) + "\n" + a1.toString());
        a1.clear();
        System.out.println("array svuotato:\n" + a1.toString());
    }
}
