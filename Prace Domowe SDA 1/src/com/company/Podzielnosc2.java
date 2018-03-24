package com.company;
// wypisz liczby podzielne przez 3 lub 5 ( w zakresie 1..100) // ZROBIONE
public class Podzielnosc2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        System.out.println("Liczby podzielne przez 3 i 5 w zakresie od 1 do 100 to: ");
        wypiszLiczby(a, b);
    }

    private static void wypiszLiczby(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + "... ");

            }
        }
    }
}
