package com.company;

// Utwórz metodę, która zwróci informację (boolean) czy przekazana liczba (typ int) jest parzysta czy nie.

public class Zadanie4 {
    public static void main(String[] args) {
        int a = 20;
        czyParzysta(a);
        System.out.println();
    }

    private static boolean czyParzysta(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
