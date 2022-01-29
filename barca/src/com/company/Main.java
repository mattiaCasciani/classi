package com.company;

public class Main {

    public static void main(String[] args) {
        Barca b1 = new Barca("nome1", "nazionalita1", 10.0, 100, "tipologia1");
        Barca b2 = new Barca("nome2", "nazionalita2", 20.0, 200, "tipologia2");

        Barca[] bVett = {b1, b2};
            Porto p1 = null;
        try {
            p1 = new Porto("nomePorto1", 10.0, bVett, 1);
            System.out.println(p1.infoPorto());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Barca b3 = new Barca("nome3", "nazionalita3", 30.0, 300, "tipologia3");
        p1.aggiungiBarca(b3);
        try {
            System.out.println(p1.rimuoviBarca(2, 5));
        }catch (Exception ex){
            System.out.println("non è possibile rimuovere una barca di un posto non esistente");
        }
        Barca b4 = new Barca("nome4", "nazionalita4", 40.0, 400, "tipologia4");
        p1.aggiungiBarca(b4);

        System.out.println(p1.infoPorto());
    }
}
