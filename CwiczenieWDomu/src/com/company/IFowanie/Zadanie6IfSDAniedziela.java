package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz jeden parametr a ona zwróci informację czy przekazany parametr jest maksymalnie
// o 2 różny od wielokrotności liczby 20
//
// NIEZROBIONE

public class Zadanie6IfSDAniedziela {
    public static void main(String[] args) {
        int a = 24;

        boolean wynik = sprawdzRoznice(a);
        System.out.println(wynik);

    }

    private static boolean sprawdzRoznice(int a) {
        int reszta = Math.abs(a) % 20;
        if (reszta >= 0 && reszta < 3 || reszta == 18 || reszta == 19) {
            return true;
        } else {
            return false;
        }
    }
}



/*

    private static boolean sprawdzLiczbe(int liczba) {

        int reszta = Math.abs(liczba) % 20;

        if ((reszta >= 0 && reszta < 3) || reszta == 18 || reszta == 19)

        */
