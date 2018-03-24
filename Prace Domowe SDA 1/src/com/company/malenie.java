package com.company;
// Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.

public class malenie {
    public static void main(String[] args) {
        int a = 20;
        counter(a);
    }

    private static void counter(int a) {
        for (int i = a; i <= 20 && i >= 10; i--) {
            System.out.println(i);

        }

    }
}

