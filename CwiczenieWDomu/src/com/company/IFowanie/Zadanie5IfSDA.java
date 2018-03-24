package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz dwa parametry a ona zwróci informację (wartość logiczną - boolean) czy obydwie są parzyste.

public class Zadanie5IfSDA {
    public static void main(String[] args) {
        int liczba1 = 10;
        int liczba2 = 12;
        boolean wynik = sprawdzCzyParzyste(liczba1, liczba2);
        System.out.println(wynik);
    }

    private static boolean sprawdzCzyParzyste(int liczba1, int liczba2) {
        if (liczba1 % 2 == 0 && liczba2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

