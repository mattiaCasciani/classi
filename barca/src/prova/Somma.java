package prova;

public class Somma {
    private Integer n1;
    private Integer n2;

    public Somma(Integer n1, Integer n2){
        this.n1=n1;
        this.n2=n2;
    }

    public Integer effettuaSomma() throws Exception {
        Integer sum=0;
        try {
            sum=n1+n2;
        }catch (Exception ex) {
            throw new Exception("non si puo fare la somma");
        }
        return sum;

    }
}
