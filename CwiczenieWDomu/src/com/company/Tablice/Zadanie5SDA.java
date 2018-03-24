package com.company.Tablice;

// Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca średnią wszystkich elementów

public class Zadanie5SDA {
    public static void main(String[] args) {

        int[] tablica = new int[4];

        tablica[0] = 2;
        tablica[1] = 5;
        tablica[2] = 7;
        tablica[3] = 5;

        obliczSume(tablica);
        obliczSrednia(tablica);
        System.out.println(obliczSrednia(tablica));

    }

    private static double obliczSrednia(int[] tablica) {
        return obliczSume(tablica) / tablica.length;
    }

    private static double obliczSume(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length ; i++) {
            suma += tablica[i];

        } return suma;
    }
}
