package com.company;

import java.util.Scanner;

public class zadanie6 { // przekazujesz parametr a zwracana jest informacja czy jest on podzielny przez 20 i maksymalnie różny o 2

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podal liczbę do sprawdzenia");
        int liczba = scanner.nextInt();

        boolean wynik = sprawdzLiczbe(liczba);
        System.out.println("Czy spełnia warunek: " + (wynik ? "TAK" : "NIE"));

    }
    private static boolean sprawdzLiczbe(int liczba){
        int reszta = liczba % 20;
        if ((reszta >= 0 && reszta < 3) || reszta == 18 || reszta == 19) {
            return true;
        } else {
            return false;
        }
    }
}