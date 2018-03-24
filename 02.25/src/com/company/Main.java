package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        boolean wynik = check(liczba);

        System.out.printf("%s: %s\n", liczba, wynik);
    }

    private static boolean check(int liczba) {
        if (liczba >= 100) {
            return true;
        } else {
            return false;
        }
    }
}