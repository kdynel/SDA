package com.company;

// Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.

public class Nieparzyste {

    public static void main(String[] args) {
        int a = -10;
        int b = 40;
        wypisz(a,b);
    }

    private static void wypisz(int a, int b) {
        for (int i = a; i <= b ; i++) {
            if (i % 2 != 0)
            System.out.println(i);

        }
    }
}
