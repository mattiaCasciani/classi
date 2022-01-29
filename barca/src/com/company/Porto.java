package com.company;

public class Porto {
    private String nomePorto;
    private Double quota;
    private Integer capienzaMax;
    private Barca[] barca;

    public Porto(String nomePorto, Double quota, Barca[] b, Integer capienzaMax) throws Exception{
        this.nomePorto = nomePorto;
        this.quota = quota;
        this.capienzaMax = capienzaMax;

        barca = new Barca[capienzaMax]; //Creo il vettore con la capienza massima così non devo ridimensionarlo.
        try {
            for(int i=0; i<barca.length; i++){
                //barca[i] = new Barca(barca[i].getNomeBarca(), barca[i].getNazionalita(), barca[i].getLunghezza(), barca[i].getStazza(), barca[i].getTipologia());
                this.barca[i] = new Barca(b[i]);
            }
        }catch (Exception e){
            throw new Exception("\nci sono troppe barche per questo porto");
        }
    }

    public Porto(Porto porto) throws Exception {
        this(porto.nomePorto, porto.quota, porto.barca, porto.capienzaMax);
    }

    public void aggiungiBarca(Barca b){

        Integer primoPostoLibero = primoPostoLibero();

        if(primoPostoLibero != null)
            barca[primoPostoLibero] = new Barca(b);
        else
            ;

    }

    private Integer primoPostoLibero(){
        Integer cont=null;

        cont = 0;
        while(cont < barca.length-1 && barca[cont] != null)
            cont++;

        if(cont==barca.length-1)
            cont = null;

        return cont;
    }

    public Double rimuoviBarca(Integer posto, Integer giorni){
        if(barca[posto-1] != null){
            barca[posto-1] = null;

            //Non faccio lo shift sinistro perchè se va via una barca non faccio spostare tutte le altre
            //compattaElementi(n-1);
            return quota * giorni;
        } else
            return null;
    }

    private void compattaElementi(int pos){
        for (int i = pos; i < barca.length-1; i++) {
            Barca bTemp = barca[i];

            barca[i] = barca[i + 1];

            barca[i + 1] = bTemp;
        }
    }

    public String infoPorto(){
        String info = "nomePorto: " + nomePorto +
                "\nquota: " + quota +
                "\ncapienzaMax: " + capienzaMax;
        for(int i=0; i<barca.length; i++)
            if(barca[i] != null)
                info += "\n\nposto n." + (i+1) + "\n" + barca[i].infoBarca();

        return info;
    }
}
