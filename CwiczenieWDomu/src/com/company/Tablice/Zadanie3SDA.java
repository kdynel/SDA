package com.company.Tablice;

// Utwórz metodę, która zwraca tablicę o podanym rozmierze wypełnioną losowymi liczbami (uzyj klasy Random()). Rozmiar tablicy ma być parametrem metody.

import java.util.Random;

public class Zadanie3SDA {
    public static void main(String[] args) {

        int rozmiarTablicy = 5;
        int[] tablica = new int[rozmiarTablicy];

        uzupelnijTablice(tablica);

        wywietlTablice(tablica);
    }

    private static int[] uzupelnijTablice(int[] tablica) {
        Random random = new Random();
        for (int i = 0; i < tablica.length ; i++) {
            tablica[i] = random.nextInt(20); // jesli podam w nawiasie wartosc dla random to bedzie losował od zera do tej wartosci wylacznie (bez niej)
        }
        return tablica;
    }

    private static void wywietlTablice(int[] tablica) {

        for(int elementTablicy :tablica){             // pętla for each
            System.out.print(elementTablicy+", ");

//        for (int i = 0; i < tablica.length  ; i++) {
//            System.out.print(tablica[i] + ", ");

        }
    }

}




   // wypelnijTablice(5);
//        System.out.println(wypelnijTablice(5));
//    }
//
//    private static int [] wypelnijTablice(int rozmiarTablicy) {
//        Random r = new Random();
//
//        int tablica[] = new int[rozmiarTablicy];
//
//        for (int i = 0; i < rozmiarTablicy ; i++) {
//            tablica [i] = r.nextInt();
//        }
//        return tablica;
//    }

