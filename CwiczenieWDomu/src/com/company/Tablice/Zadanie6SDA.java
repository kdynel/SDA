package com.company.Tablice;

// Utwórz metodę, która przyjmuje dwa parametry - tablicę oraz liczbę.
// Metoda ma zwrócić informację (jako wartość logiczna) czy dana liczba znajduje się w tablicy.

public class Zadanie6SDA {
    public static void main(String[] args) {

        int[] tablica = new int[4];
        tablica[0] = 1;
        tablica[1] = 34;
        tablica[2] = 19;
        tablica[3] = 627;

        int liczba = 628;

        System.out.println(sprawdzLiczbe(tablica, liczba));
    }

    private static boolean sprawdzLiczbe(int[] tablica, int liczba) {
        for (int i = 0; i < tablica.length; i++) {
            if (liczba == tablica[i]) {
                return true;
            }
        }
        return false;
    }

}
