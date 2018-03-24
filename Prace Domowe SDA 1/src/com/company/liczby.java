package com.company;
// wypisz liczby od 100 do 1 ZROBIONE
public class liczby {
    public static void main(String[] args) {
        int a = 100;
        int b = 1;
        wypiszLiczby(a,b);
    }

    private static void wypiszLiczby(int a, int b) {
        for (int i = a; i >= b ; i--) {
            System.out.println(i);

        }
    }
}
