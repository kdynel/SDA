package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz jeden parametr (typu int) oraz zwraca informację (typu logicznego) czy liczba jest większa (bądź równa) od 100

public class Zadanie1IfSDAniedziela {
    public static void main(String[] args) {
        int a = 102;

        boolean wynik = czywWiekszaOdSto(a);
        System.out.println(wynik);
    }

    private static boolean czywWiekszaOdSto(int a) {
        if (a >= 100) {
            return true;
        } else {
            return false;
        }
    }
}
