package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz trzy parametry (typu int) oraz zwraca informację
// (typu logicznego) czy wszystkie liczby są takie samie (true - są, false - nie są)

public class Zadanie2IfSDAniedziela {
    public static void main(String[] args) {
        int firstValue = 20;
        int secondValue = 20;
        int thirdValue = 20;

        boolean result = checkIfEqual(firstValue, secondValue, thirdValue);
        System.out.println(result);
    }

    private static boolean checkIfEqual(int firstValue, int secondValue, int thirdValue) {
        if (firstValue == secondValue && firstValue == thirdValue) {
            return true;
        } else {
            return false;
        }
    }
}
