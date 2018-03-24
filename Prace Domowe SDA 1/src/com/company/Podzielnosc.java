package com.company;
// wypisz liczby podzielne przez 8 ( w zakresie 1..100) ZROBIONE

public class Podzielnosc {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        System.out.println("Liczby podzielne przez 8 w zakresie od 1 do 100 to: ");
        sprawdzCzyPodzielne(a, b);
    }

    private static void sprawdzCzyPodzielne(int a, int b) {
        for (int i = a; i <= b; i++)
            if (i % 8 == 0) {
                System.out.print(i + ", ");
            }
    }
}
