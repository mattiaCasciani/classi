package trova_eccezioni;

public class Eccezioni {
    public static void main(String[] args) {
        Double[]a={10.0,11.0,12.2};
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(a[i]);
            }
        }catch (Exception ex){
            //System.out.println(ex.getMessage());
            //for (int i = 0; i < a.length; i++) {
            //    System.out.println(a[i]);
            //}
        }

        Double a1= 100.0;
        Double b=null;
        Double c;
        try{
            c=a1/b;
        }catch(Exception ex){
            System.out.println("\nnon si possono fare divisioni per null");
        }
    }
}
