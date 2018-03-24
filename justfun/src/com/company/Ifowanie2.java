package com.company;

// Utwórz metodę, do której przekazujesz dwa parametry a ona zwróci mniejszy z nich

public class Ifowanie2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        porownanie(a, b);
    }

    private static int porownanie(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
