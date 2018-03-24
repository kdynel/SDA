package com.company;
// podaj liczne do skanera i sprawdz czy jest parzysta // ZROBIONE

import java.util.Scanner;

public class czyParzysta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia czy jest parzysta");
        int liczba = scanner.nextInt();
        sprawdzParzystosc(liczba);
        boolean wynik = sprawdzParzystosc(liczba);
        System.out.printf("Liczba %s %s parzysta", liczba, wynik ? "jest" : "nie jest"); // jak to sie rozumuje i czyta
    }

    private static boolean sprawdzParzystosc(int liczba) {
        if (liczba % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}

