package com.company;

public class Main {

    public static void main(String[] args) {
        int []punti={1,4,1,4,1,4,4,8,1,10,10,2,2,2,1,3,10,1,1,1,4,4,10,10,10,8};



        Punteggio p = new Punteggio(punti);

        System.out.println("Stampa: "+p.toString());

        try{
            System.out.println("Valore della lettera: "+p.puntoLettera('z'));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        Scarabeo s= new Scarabeo(p);
        try{
            System.out.println("valore della parola: "+s.puntiParola("ARChrh"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        String []parole={"SCARABEO","MACCHINA","ALBERO"};
        try{
            System.out.println("Valore delle parole "+s.puntiParole(parole));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }


}

