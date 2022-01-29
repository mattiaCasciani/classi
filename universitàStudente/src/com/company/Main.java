package com.company;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Studente[] s = new Studente[2];
        Docente[] d = new Docente[2];
        Facolta[] f = new Facolta[2];
        f[0] = new Facolta("MD", 2, s, d);
        f[1] = new Facolta("IF", 2, s, d);
        try {
            Studente s1 = new Studente("Industrale", 2007, 2012, "Malfer", "Francesco", "GTHETS84OENST", "24/11/2004");
            Studente s2 = new Studente("Industrale", 2007, 2012, "Intini", "Rocco", "GTHETS64OENST", "24/11/2004");
            Docente d1 = new Docente("triennale ", 3, "Marra", "Daniele", "GTHETS64OENST", "24/11/2004");
            f[0].addStudente(s1);
            System.out.println(f[0].info());
            System.out.println("\n-----------------\n");
            f[0].addStudente(s2);
            System.out.println("\n-----------------\n");
            System.out.println(f[0].info());
            System.out.println("\n-----------------\n");
            f[0].addDocente(d1);
            f[0].removeStudente("HSMHDFSFSF");
            System.out.println(f[0].info());
            f[1].addDocente(d1);
            f[1].addStudente(s2);
            System.out.println(f[1].info());
            Dipartimento []dip = new Dipartimento[2];
            f[1].removeDocente("GTHETS64OENST");
            System.out.println(f[1].info());
            dip[0] = new Dipartimento("GF", f);
            dip[1] = new Dipartimento("FT", f);

            Universita u = new Universita(5, dip);

            u.info();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
