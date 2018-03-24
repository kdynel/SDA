package com.company;

public class zadanie3 {
    // sprawdz czy podana liczba miesci sie w zakresie od 11 do 22 i zdefiniuj co sie dzieje gdy jest ponizej
    // lub powyzej tego zakresu

    public static void main(String[] args) {
        int a = 5;
        int porównaj = porównaj(a);
        System.out.println(porównaj);
    }

    private static int porównaj(int a) {
        int max = 22;
        int min = 11;

        if (a >= min && a <= max) {
            return 0;
        } else if (a < min) {
            return min - a;
        } else {
            return max - a;
        }

    }
}


