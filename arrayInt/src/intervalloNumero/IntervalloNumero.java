package intervalloNumero;
import com.company.ArrayInt;

public class IntervalloNumero {
    private ArrayInt valori;

    public IntervalloNumero(int n){
        valori= new ArrayInt(n);
    }

    public void set(int n){
        valori.add(n);
    }

    public IntervalloNumero unione(IntervalloNumero a){
        IntervalloNumero a2= new IntervalloNumero(valori.size()+a.valori.size());
        int k=0;
        for(int i=0; i<(valori.size()+a.valori.size()); i++){
            if(i>=valori.size()) {
                a2.valori.add(a.valori.get(k));
                k++;
            }
            else
                a2.valori.add(valori.get(i));
        }
        return senzaDoppioni(a2);
    }

    private IntervalloNumero senzaDoppioni(IntervalloNumero a){
        int sub[]=new int[a.valori.size()];
        int i=1, k=1;
        sub[0]=a.valori.get(0);
        while(i<sub.length){
            if(i<sub.length&&k<sub.length&&!a.valori.isPresente(a.valori.get(i),0,i)){
                sub[k]=a.valori.get(i);
                k++;
            }
            i++;
        }
        IntervalloNumero a2=new IntervalloNumero(k);
        for(i=0;i<k;i++){
            a2.valori.add(sub[i]);
        }
        return a2;
    }

    public String toString(){
        return valori.toString();
    }

}
