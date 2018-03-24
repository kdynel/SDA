package com.company; // Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        boolean wynik = czyParzysta(a);
        System.out.println(wynik);
    }

    private static boolean czyParzysta(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
