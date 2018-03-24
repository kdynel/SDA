package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz jeden parametr i zwracana jest informacja czy liczba jest większa (bądź równa) od 20
// czyli dla 6 zwróci false a dla 22 zwróci true

public class Zadanie1IfSDA {
    public static void main(String[] args) {
        int a = 22;

        boolean wynik = sprawdzLiczbe(a);
        System.out.println(wynik);
    }

    private static boolean sprawdzLiczbe(int a) {
        if (a >= 20) {
            return true;
        } else {
            return false;
        }
    }

}


