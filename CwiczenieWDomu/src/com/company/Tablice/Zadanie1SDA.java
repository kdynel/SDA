package com.company.Tablice;

// Utwórz metodę, która zwraca tablicę o podanym rozmiarze wypełnioną kolejnymi wartościami:
// Dla 4 zwróci: [0, 1, 2, 3]

public class Zadanie1SDA {
    public static void main(String[] args) {

        int tablica[] = new int[8];

        uzupelnijTablice(tablica);
        wyswietlTablice(tablica);

    }

    private static void wyswietlTablice(int[] tablica) {
        for (int i = 0; i < tablica.length ; i++) {
            System.out.print(tablica[i]+" ");
        }
    }

    private static int[] uzupelnijTablice(int[] tablica) {
        for (int i = 0; i < tablica.length ; i++) {

            tablica[i] = i;
        }
        return tablica;
    }
}
