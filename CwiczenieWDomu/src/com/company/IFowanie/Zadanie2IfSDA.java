package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz dwa parametry a ona zwróci mniejszy z nich czyli dla 6 i 8 zwróci 6

public class Zadanie2IfSDA {
    public static void main(String[] args) {
        int firstValue = 12;
        int secondValue = 19;

        int wynik = returnGreaterNumber(firstValue, secondValue);
        System.out.print("Większa liczba z podanych to: ");
        System.out.println(wynik);
    }

    private static int returnGreaterNumber(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }


}
