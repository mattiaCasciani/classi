package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Padre p=new Padre();
        Figlio f=new Figlio();
        Padre pf= new Figlio();
        Padre pp=pf;

        System.out.println("p "+p.toString());
        System.out.println("pp "+pp.toString());

        p.incrementa();

        System.out.println("p "+p.toString());
        System.out.println("pp "+pp.toString());

        pp.incrementa();

        System.out.println("p "+p.toString());
        System.out.println("pp "+pp.toString());

        f.incrementa();

        System.out.println("f "+f.toString());

        pf.incrementa();

        System.out.println("pf "+pf.toString());

        Figlio ff=(Figlio) pp;

        System.out.println("ff "+ff.toString());

        ff=(Figlio) pf;

        System.out.println("ff "+ff.toString());
    }
}
