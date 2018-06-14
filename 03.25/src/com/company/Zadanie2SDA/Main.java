package com.company.Zadanie2SDA;

public class Main {
    public static void main(String[] args) {
        Pies pies = new Pies();
        System.out.println(pies.dajGlos());
        Kot kot = new Kot();
        System.out.println(kot.dajGlos());

        System.out.println(new Kon().dajGlos()); // polaczenie dwoch linijek powyzej w jedną
    }
}
