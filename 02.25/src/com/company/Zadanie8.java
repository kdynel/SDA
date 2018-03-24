package com.company;

import java.util.Scanner;

public class Zadanie8 {
// podaj liczbę a program sprawdzi czy jest mniejszy, wiekszy, czy miesci sie w przedziale
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe do sprawdzenia:");
        int a = scanner.nextInt();

        String czyLiczbaJestWPrzedziale = Przedział(a);
        System.out.println(czyLiczbaJestWPrzedziale);

    }

    private static String Przedział(int a) {
        int min = -5;
        int max = 5;

        if (a < min) {
            return String.format("Liczba %s jest mniejsza od %s", a, min);
        } else if (a > max) {
            return String.format("Liczba %s jest większa od %s", a, max);
        } else {
            return String.format("Liczba %s jest w przedziale < %s, %s >", a, min, max);
        }
    }

}

