package com.company.IFowanie;

// Utwórz metodę, która zwróci informację (boolean) czy przekazana liczba (typ int) jest parzysta czy nie.
// dla 12 zwróci true a dla 9 false

public class Zadanie4IfSDA {
    public static void main(String[] args) {
        int liczba = 15;

        boolean wynik = czyParzysta(liczba);
        System.out.println(wynik);
    }

    private static boolean czyParzysta(int liczba) {
        if (liczba % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


