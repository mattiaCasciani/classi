package intervalloNumero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntervalloNumero a= new IntervalloNumero(3);
        IntervalloNumero a1= new IntervalloNumero(3);
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<3;i++){
            a.set(scan.nextInt());
        }
        for(int i=0;i<3;i++){
            a1.set(scan.nextInt());
        }

        System.out.println(a.unione(a1).toString());
    }
}
