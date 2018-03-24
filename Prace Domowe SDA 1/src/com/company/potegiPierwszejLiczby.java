package com.company; // Utwórz metodę, do której przekazujesz dwa parametry. Metoda ma wyświetlić wszystkie potęgi pierwszej liczby do momentu przekroczenia drugiej liczby.

public class potegiPierwszejLiczby {

    public static void main(String[] args) {
        int a = 3;
        int b = 100;
        sprawdzPotegi(a, b);
    }

    private static void sprawdzPotegi(int a, int b) {
        double wynik=0;
        for (int i = 0; wynik <= b ; i++) {
            System.out.println(wynik);
            wynik = Math.pow(a,i);


        }
    }

}
