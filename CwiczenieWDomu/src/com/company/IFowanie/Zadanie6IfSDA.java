package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz trzy parametry a ona zwróci informację (wartość logiczną - boolean)
// czy suma pierwszych dwóch daje trzeci.

public class Zadanie6IfSDA {
    public static void main(String[] args) {
        int pierwszyParametr = 1;
        int drugiParametr = 5;
        int trzeciParametr = 8;
        boolean wynik = czySumaDajeTrzeciParametr(pierwszyParametr, drugiParametr, trzeciParametr);
        System.out.println(wynik);
    }

    private static boolean czySumaDajeTrzeciParametr(int pierwszyParametr, int drugiParametr, int trzeciParametr) {
       if (pierwszyParametr + drugiParametr == trzeciParametr) {
            return true;
        } else {
            return false;
        }
    }
}

