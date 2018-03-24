package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz trzy parametry a ona zwróci informację czy chociaż jeden z nich jest większy o ponad 10 od którejś z pozostałych.

public class Zadanie5IfSDAniedziela {
    public static void main(String[] args) {
        int firstValue = 1;
        int secondValue = 2;
        int thirdValue = 21;

        boolean wynik = checkIfGreaterThanTen(firstValue, secondValue, thirdValue);
        System.out.println(wynik);
    }

    private static boolean checkIfGreaterThanTen(int firstValue, int secondValue, int thirdValue) {
        if (firstValue - secondValue >= 10 || firstValue - secondValue >= 10) {
            return true;
        } else if (secondValue - firstValue >= 10 || secondValue - thirdValue >= 10) {
            return true;
        } else if (thirdValue - firstValue >= 10 || thirdValue - secondValue >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
