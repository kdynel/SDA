package com.company;

import java.util.Scanner;

public class cwiczenie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę A do podniesienia do potęgi:");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę potęgi do której podnieść liczbę A:");
        int b = scanner.nextInt();
        int wynik = powResult(a, b);
        System.out.println("Liczba A podniesiona do wskazanej potęgi to " + wynik);

    }

    private static int powResult(int a, int b) {
        if (a > 0) {
            int result = a;
            for (int i = 0; i < b - 1; i++) {
                result = result * a;
            }

            return result;
            //return a ^ 3;
        } else {
            System.out.println("Nieprawidłowa wartość liczby");
        }
        return a;
    }
}

