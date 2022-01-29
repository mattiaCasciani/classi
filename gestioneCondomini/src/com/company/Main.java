package com.company;

public class Main {

    public static void main(String[] args) {
        Condominio b[]={new Condominio(2, new Appartamento[]{new Appartamento("Francesca",15,1),
                                                                    new Appartamento("Fabrizio",25,2)}),
                        new Condominio(2, new Appartamento[]{new Appartamento("Marta",23,1),
                                                                    new Appartamento("Martina",12,2)})};
	    Gestione a=new Gestione("ABCD",b);

        System.out.println(a.toString());
    }
}
