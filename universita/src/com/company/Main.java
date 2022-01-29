package com.company;

/**
 *
 * @author Mattia Casciani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        try{
            Studente [] s1 ={new Studente("Rocco","Intini","24022004","RCCNTN04TN023"),
                                                new Studente("Marco","Polimeni","12112005","MRCPLM04CTZ22")};

            Studente [] s2 = {new Studente("Gesualdo", "Lomonaco", "01091999", "GSDLMN99RMN30")};

            Facolta [] f1 = {new Facolta(s1, "CAT"),  new Facolta(s2,"Informatica")};

            Studente s3 = new Studente("Delia", "Zampriglio","12062003" , "DLZMP03DNKR12");
            Universita uni = new Universita(f1, "Accademia della cisco");
            System.out.println(uni.stampa());
            uni.addStudente(s3, 1);

            System.out.println(uni.stampa());

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}

