package com.company;

// wypisz liczby parzyste od 2 do 50 // ZROBIONE

public class Petla3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 50;
        System.out.println("Twoje liczby parzyste to:");
        wskazParzyste(a, b);
    }

    private static void wskazParzyste(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
