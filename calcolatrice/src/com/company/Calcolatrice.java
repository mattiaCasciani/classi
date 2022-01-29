package com.company;

import com.sun.source.tree.InstanceOfTree;

import java.util.Arrays;
import java.util.Collections;

public class Calcolatrice <T>{
    private T[] numeri;
    Integer dimL;

    public Calcolatrice(T[] t){
        dimL=0;
        numeri = (T[]) new Object[t.length];
        for(int i=0; i<t.length; i++){
            numeri[i]=t[i];
            dimL++;
        }
    }

    public T getT(T t) {
        return numeri[(int) t];
    }

    public void add(T t) {
        if (isFull()) {
            T[] nuovoVettore = (T[]) new Object[numeri.length*2];
            for (int i = 0; i < numeri.length; i++)
                nuovoVettore[i] = numeri[i];
            numeri = nuovoVettore;
        }
        numeri[dimL]=t;
        dimL++;
    }

    private boolean isFull(){
        if(dimL==numeri.length)
            return true;
        return false;
    }

    private Float toFloat(T t){
        Float num = null;
            if (t instanceof Integer)
                num = ((Integer) t).floatValue();
            if (t instanceof Double)
                num = ((Double) t).floatValue();
            if(t instanceof Byte)
                num =((Byte)t).floatValue();
            if(t instanceof String)
                num =Float.valueOf((String)t);
        if(t instanceof Character)
            num =Float.valueOf(((Character) t).charValue());
        if(t instanceof Float)
            num =(Float)t;
        return num;
    }

    public T somma(){
        Float somma = Float.valueOf(0);
        for(int i =0; i< dimL;i++)
            somma +=(Float) toFloat(numeri[i]);
        return (T)somma;
    }

    public T somma(T t1, T t2){
        Float somma = (Float)toFloat(numeri[(int) t1])+(Float)toFloat(numeri[(int) t2]);
        return (T)somma;
    }

    public T sottrazione(){
        Float differenza = (Float) toFloat(numeri[0]);
        for(int i =1; i< dimL;i++)
            differenza-= (Float)toFloat(numeri[i]);
        return (T)differenza;
    }

    public T sottrazione(T t1, T t2){
            Float differenza = (Float)toFloat(numeri[(int) t1])-(Float)toFloat(numeri[(int) t2]);
        return (T)differenza;
    }

    public T sortedSottrazione(){
        T[] sorted = sort();
        Float differenza= (Float)toFloat(sorted[0]);
        for (int i=1;i<sorted.length;i++)
            differenza -= (Float)toFloat(sorted[i]);
        return (T) differenza;
    }

    private T[] sort(){
        T[] num = (T[]) new Object[dimL];
        for(int i=0;i< dimL;i++)
            num[i]=(T)toFloat(numeri[i]);
        Arrays.sort(num, Collections.reverseOrder());
        return num;
    }

    public T moltiplicazione(){
        Float risultato = (Float)toFloat(numeri[0]);
        for(int i=1;i<dimL;i++)
            risultato*=(Float)toFloat(numeri[i]);
        return (T)risultato;
    }

    public T moltiplicazione(T t1, T t2){
        Float risultato = (Float)toFloat(numeri[(int) t1])*(Float)toFloat(numeri[(int) t2]);
        return (T)risultato;
    }

    public T divisione(){
        Float risultato =(Float)toFloat(numeri[0]);
        for(int i=1;i<dimL;i++)
            risultato/= (Float)toFloat(numeri[i]);
        return (T)risultato;
    }

    public T divisione(T t1, T t2){
        Float risultato = (Float)toFloat(numeri[(int) t1])/(Float)toFloat(numeri[(int) t2]);
        return (T)risultato;
    }

    @Override
    public String toString() {
        return "Calcolatrice{" +
                "numeri=" + Arrays.toString(numeri) +
                ", dimL=" + dimL +
                '}';
    }
}
