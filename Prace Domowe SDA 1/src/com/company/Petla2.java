package com.company;

// wypisz liczby od 1 do 100 // ZROBIONE

public class Petla2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        System.out.println("Twoje liczby to: ");
        System.out.println(wypiszLiczby(a, b));

    }

    private static String wypiszLiczby(int a, int b) {
        String napis = "";
        for (int i = a; i <= b ; i++) {
            napis += i + ", ";

        }
        return napis;
    }
}
