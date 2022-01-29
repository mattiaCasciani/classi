package com.company;

public class ArrayInt {
    int[] valore;
    int numElem;
    public ArrayInt(int val){
        valore = new int[val];
        numElem = 0;

    }

    public int size(){
        return numElem;
    }

    public boolean isEmpty(){
        boolean empty=false;
        int i=0;
        while(i<numElem && empty==false){
            if(valore[i]==0)
                empty=true;
            else
                i++;
        }
        numElem=i;
        return empty;
    }

    public boolean isFull(){
        if(numElem==valore.length)
            return true;
        else
            return false;
    }

    public boolean add(int v){
        boolean inserito=false;
        if(!isFull()){
            valore[numElem]=v;
            inserito=true;
            numElem++;
        }
        return inserito;
    }

    public void clear(){
        for(int i=0;i<numElem;i++){
            valore[i]=0;
        }
        numElem=0;
    }

    public int get(int index) {
        return valore[index];
    }

    public int indexOf(int v){
        int i=0;
        while(i<numElem && valore[i] != v){
            i++;
        }
        if(i==numElem)
            i=-1;
        return i;
    }

    public int remove(int index){
        int salvaNum = valore[index];
        shiftS(index);
        return salvaNum;
    }

    private void shiftS(int index){
        for (int i = numElem; i > index; i--) {
            valore[i] = valore[i - 1];
        }
        valore[numElem-1]=0;
        numElem--;
    }

    private void shiftDestra(int index){
        while(index<(numElem+1)){
            valore[index]=valore[index-1];
            index++;
        }
        valore[numElem+1]=0;
        numElem++;
    }

    public int lastIndexOf(int v){
        int val=-1;
        if(indexOf(v) != -1){
            for(int i=0;i<numElem;i++){
                if(valore[i]==v)
                    val=valore[i];
            }
        }
        return val;
    }

    public int[] subList(int fromIndex, int toIndex){
        int[] sub = new int[toIndex-fromIndex];
        int j= fromIndex;
        for(int i=0; i<(toIndex-fromIndex); i++){
            sub[i]= valore[j];
            j++;
        }
        return sub;
    }

    public boolean isPresente(int v, int fromIndex, int toIndex) {
        int i = 0;
        while (i < subList(fromIndex, toIndex).length && subList(fromIndex, toIndex)[i] != v) {
            i++;
        }
        if(i==subList(fromIndex, toIndex).length)
            i--;
        if (subList(fromIndex, toIndex)[i]==v && i < subList(fromIndex, toIndex).length) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String testo="";
        for(int i=0;i<numElem;i++){
            testo += String.valueOf(valore[i]) + "\t";
        }
        testo += "\n" + numElem;
        return testo;
    }
}
