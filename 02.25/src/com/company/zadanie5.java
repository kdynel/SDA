package com.company;

import java.util.Scanner;

public class zadanie5 { // czy jedna z 3 podanych w konsoli liczb jest większa o ponad 10 od chociaz jednej z reszty

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę A do sprawdzenia");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbę B do sprawdzenia");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbę C do sprawdzenia");
        int c = scanner.nextInt();

        boolean czyistniejeNajwieksza = znajdzNajwiekszaLibcze(a, b, c);

        System.out.println("Czy jedna z nich jest większa o ponad 10 od pozostałych: " + czyistniejeNajwieksza);
    }

    private static boolean znajdzNajwiekszaLibcze(int a, int b, int c) {
        int distance = 10;

        if (a > b + distance
                || a > c + distance
                || b > a + distance
                || b > c + distance
                || c > a + distance
                || c > b + distance) {
            return true;
        } else {
            return false;
        }
    }
}



