package com.company;

public class Main {

    public static void main(String[] args) {
        Studente classe[]={new Studente("Francesco",5,5,5),
                            new Studente("Roberto",6,6,6),
                            new Studente("Pietro",7,7,7),
                            new Studente("Michele",8,8,8),
                            new Studente("Stefano",9,9,9)};
        Classe a = new Classe("4INC", "240", 5, classe);

        System.out.println(a.toString());
    }
}
