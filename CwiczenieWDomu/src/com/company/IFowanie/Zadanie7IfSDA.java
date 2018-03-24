package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz dwa parametry a ona zwróci informację (wartość logiczną - boolean) czy chociaż jeden z nich jest większy od zera.

public class Zadanie7IfSDA {
    public static void main(String[] args) {
        int firstValue = 2;
        int secondValue = -5;
        boolean result = checkIfGreaterThanZero(firstValue, secondValue);
        System.out.println(result);
    }

    private static boolean checkIfGreaterThanZero(int firstValue, int secondValue) {
        if (firstValue > 0 || secondValue > 0) {
            return true;
        } else {
            return false;
        }
    }
}
