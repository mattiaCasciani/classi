package com.company;

public class Main {

    public static void main(String[] args) {
        String[] numeri = {"2", "10"};
	    Calcolatrice calcolatrice = new Calcolatrice <>(numeri);
        System.out.println(calcolatrice.toString());
        calcolatrice.add(4);
        calcolatrice.add('6'); // il suo valore è 54
        calcolatrice.add(9.0);
        //calcolatrice.add('a');
        System.out.println(calcolatrice.toString());
        System.out.println(calcolatrice.somma());
        System.out.println(calcolatrice.somma(1, 3));
        System.out.println(calcolatrice.sottrazione());
        System.out.println(calcolatrice.sottrazione(1, 3));
        System.out.println(calcolatrice.sortedSottrazione());
        System.out.println(calcolatrice.moltiplicazione());
        System.out.println(calcolatrice.moltiplicazione(1, 3));
        System.out.println(calcolatrice.divisione());
        System.out.println(calcolatrice.divisione(3, 0));
    }
}
