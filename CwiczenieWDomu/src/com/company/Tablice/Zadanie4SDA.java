package com.company.Tablice;

// Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca sumę wszystkich elementów.

import java.sql.Array;
import java.util.Arrays;

public class Zadanie4SDA {
    public static void main(String[] args) {

        int[] tablica = new int[4];
        tablica[0] = 2;
        tablica[1] = 5;
        tablica[2] = 5;
        tablica[3] = 10;

        System.out.println(sumujElementyTablicy(tablica));
        //    int sumaLiczb = sumujElementyTablicy(tablica);
        //   System.out.println(sumaLiczb);                       to samo co sout wyzej ale tworząc nowy int
        //   System.out.println(Arrays.toString(tablica));        Arrays.toString to bilbioteka która umozliwia wyswietlanie tabeli
    }

    private static int sumujElementyTablicy(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length ; i++) {
            suma += tablica[i];

        }
        return suma;
    }
}
