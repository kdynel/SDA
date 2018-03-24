package com.company.Tablice;

// Utwórz metodę, w której użytkownik podaje z klawiatury rozmiar tablicy, a następnie wszystkie elementy:
//
//    Podaj rozmiar tablicy:  4
//    88
//    12
//    -7
//    195
//    Podana tablica to: [88, 12, -7, 195]


import java.util.Scanner;

public class Zadanie2SDA {
    public static void main(String[] args) {
        int rozmiar = pobierzRozmiar();
        int tablica[]=new int [rozmiar];
        uzupelnijTablice(tablica);
        wyswietlTablice(tablica);
    }

    private static void wyswietlTablice(int[] tablica) {
        for (int i = 0; i < tablica.length ; i++) {
            System.out.print(tablica[i] + " ");
        }
    }

    private static int[] uzupelnijTablice(int[] tablica) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tablica.length ; i++) {
            System.out.println("Podaj kolejny element dla tablicy");
            tablica[i] = scanner.nextInt();
        }
        return tablica;
    }

    private static int pobierzRozmiar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int rozmiar = scanner.nextInt();
        return rozmiar;
    }
}
