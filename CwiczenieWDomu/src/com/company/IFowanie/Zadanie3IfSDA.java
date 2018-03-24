package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz trzy parametry a ona zwróci największy z nich
// czyli dla 1 2 3 zwróci 3

public class Zadanie3IfSDA {
    public static void main(String[] args) {
        int firstValue = 10;
        int secondValue = 25;
        int thirdValue = 4323;
        int wynik = showTheBiggest(firstValue, secondValue, thirdValue);
        System.out.println(wynik);
    }

    private static int showTheBiggest(int firstValue, int secondValue, int thirdValue) {
        if (firstValue > secondValue && firstValue > thirdValue) {
            return firstValue;
        } else if (secondValue > firstValue && secondValue > thirdValue) {
            return secondValue;
        } else {
            return thirdValue;
        }
    }

}


/*

    private static int maxNum(int a, int b, int c) {
        int result = a;

        if (b > result) {
            result = b;
        }

        if (c > result) {
            result = c;
        }

        return result;
 */