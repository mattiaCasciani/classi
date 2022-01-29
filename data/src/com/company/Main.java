package com.company;

public class Main {

    public static void main(String[] args)  {
        try {
            Data d1 = new Data(16, 9, 2015);
            Data d2 = new Data(18, 2, 2020);
            Data d3 = new Data(18, 3, 2001);
            System.out.println("Differenza in giorni: " + d1.differenzaInGiorni(d1, d2));
            System.out.println("Differenza in settimane: " + d1.differenzaInSettimane(d1, d2));
            System.out.println("Differenza in mesi: " + d1.differenzaInMesi(d1, d2));
            System.out.println("Differenza in anni: " + d1.differenzaInAnni(d1, d2));
            System.out.println("Differenza in giorni, mesi e anni: " +
                    d1.differenzaInGiorniMesiAnni(d1, d2));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
