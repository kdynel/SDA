package com.company;

// Utwórz metodę, do której przekazujesz jeden parametr i zwracana jest informacja czy liczba jest większa (bądź równa) od 20
//Czyli dla 6 zwróci false,
//a dla 22 zwróci true


public class Ifowanie {
    public static void main(String[] args) {
        int a = 5;
        sprawdzLiczbe(a);
    }

    private static boolean sprawdzLiczbe(int a) {
        if (a >= 20) {
            return true;
        } else {
            return false;
        }
    }
}
