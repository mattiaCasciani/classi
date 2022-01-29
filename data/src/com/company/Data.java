package com.company;

import java.util.GregorianCalendar;
public class Data {
    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;
    public Data(Integer giorno, Integer mese, Integer anno) throws Exception{
        setGiorno(giorno);
        setMese(mese);
        setAnno(anno);
    }
    public Data(String data) {
        this.data = data;
    }
    public Data() {
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Integer getGiorno() {
        return giorno;
    }
    public void setGiorno(Integer giorno) throws Exception {
        try {

            if (giorno >= 1 && giorno <= 31) {
                this.giorno = giorno;
            } else {
                throw new Exception("Giorno non valido");
            }} catch (NullPointerException ex) {
            throw new Exception("Il giorno non può essere null");
        }
    }
    public Integer getMese() {
        return mese;
    }
    public void setMese(Integer mese) throws Exception {
        try {
            if (mese >= 1 && mese <= 12) {
                this.mese = mese;
            } else {
                throw new Exception("mese non valido");
            }
        } catch (NullPointerException ex) {
            throw new Exception("Il mese non può essere null");
        }
    }
    public Integer getAnno() {
        return anno;
    }
    public void setAnno(Integer anno) throws Exception {
        try {
            if (anno >= 1) {
                this.anno = anno;
            } else {
                throw new Exception("Anno non valido");
            }
        } catch (NullPointerException ex) {
            throw new Exception("L'anno non può essere null");
        }
    }
    public Integer differenzaInGiorni(Data d1, Data d2) throws Exception {
        GregorianCalendar data1 = new GregorianCalendar(d1.anno, d1.mese, d1.giorno);
        GregorianCalendar data2 = new GregorianCalendar(d2.anno, d2.mese, d2.giorno);
        long diff = 0;
        if (d1.anno > d2.anno) {

            diff = (data1.getTimeInMillis()) - (data2.getTimeInMillis());
            diff = (data2.getTimeInMillis()) - (data1.getTimeInMillis());

        } else {
            if (d1.mese > d2.mese) {
                diff = (data1.getTimeInMillis()) - (data2.getTimeInMillis());
            } else if (d1.mese < d2.mese) {
                diff = (data2.getTimeInMillis()) - (data1.getTimeInMillis());
            } else {
                if (d1.giorno > d2.giorno) {
                    diff = (data1.getTimeInMillis()) - (data2.getTimeInMillis());
                } else if (d1.giorno < d2.giorno) {
                    diff = (data2.getTimeInMillis()) - (data1.getTimeInMillis());
                } else {
                    throw new Exception("Le due date sono uguali");
                }
            }
        }
        long giorni = diff / (1000 * 60 * 60 * 24);
        return (int) giorni;
    }
    public Integer differenzaInSettimane(Data d1, Data d2) throws Exception {
        return (differenzaInGiorni(d1, d2)) / 7;
    }
    public Integer differenzaInMesi(Data d1, Data d2) throws Exception {
        return (differenzaInGiorni(d1, d2)) / 30;
    }
    public Integer differenzaInAnni(Data d1, Data d2) throws Exception {
        return (differenzaInGiorni(d1, d2)) / 365;
    }
    public String differenzaInGiorniMesiAnni(Data d1, Data d2) throws Exception {
        int anniInteri = differenzaInGiorni(d1, d2) / 365;
        int restoGiorni = differenzaInGiorni(d1, d2) - (anniInteri * 365);
        int mesi = restoGiorni / 30;
        int giorni = restoGiorni - (mesi * 30);
        return giorni + " giorni, " + mesi + " mesi, " + anniInteri + " anni";
    }
    private Boolean validaData(String data) {
        boolean out = false;String[] strSplit;
        if (data.contains("/")) {
            strSplit = data.split("\\/");
        } else {
            strSplit = data.split("\\-");
        }
        int giorni = Integer.parseInt(strSplit[0]);
        int mesi = Integer.parseInt(strSplit[1]);
        int anni = Integer.parseInt(strSplit[2]);
        if ((giorni >= 1 && giorni <= 31) && (mesi >= 1 && mesi <= 12) && anni >= 1) {
            out = true;
        }
        return out;
    }
}
