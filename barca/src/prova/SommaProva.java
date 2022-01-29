package prova;

public class SommaProva {
    public static void main(String[] args) {
        Somma s1=new Somma(10, null);
        try {
            System.out.println(s1.effettuaSomma());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
