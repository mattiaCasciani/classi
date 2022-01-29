package com.company;

public class ArrayNumero{
    private int[] numeri;
    private int dimL;

    public ArrayNumero(int dimF){
        numeri = new int[dimF];
        dimL = 0;
    }

    public int getNumeri(int pos){
        return numeri[pos];
    }

    private boolean isFull(){
        boolean full=false;
        if(dimL==numeri.length)
            full=true;
        return full;
    }

    private boolean isEmpty(){
        boolean empty=false;
        int i=0;
        if(isFull()==false){
            while(i<numeri.length && numeri[i] ==0){
                i++;
            }
            if(i == numeri.length){
                empty=true;
            }
        }
        return empty;
    }

    private boolean isPresente(int num){
        boolean presente=false;
        int i=0, posNumMaggiore;
        while(i<numeri.length && num<numeri[i] && !presente && !isEmpty()){
            if(num != numeri[i]){
                i++;
            }else{
                posNumMaggiore=i;
                presente=true;
            }
        }
        return presente;
    }

    public boolean add(int num){
        boolean b= true;
        if(!isFull()){
            int i=0;
            while(i<dimL && numeri[i]<num){
                i++;
            }
            if(numeri[i]==num)
                b=false;
            else{
                if(i<dimL)
                    shift(i);
                numeri[i]=num;
                dimL++;
            }

        }
        return b;
    }

    private void shift(int index){
        for(int i=dimL;i>index;i--)
            numeri[i]=numeri[i-1];
    }

    public String stampa(){
        String testo ="";
        for(int i=0;i<numeri.length;i++){
            testo += numeri[i] + "\t";
        }
        testo += "\n" + dimL;
        return testo;
    }
}
