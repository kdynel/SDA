package com.company;

public class nowy {

    public static void main(String[] args) {

        int wynik = add(10, 20);
        System.out.println(add(10, 20));

        int wynik2 = add(15, 30);
        int wynik3 = odejmij(15, 30);
        int wynik4 = mnozenie(10, 10);
        int wynik5 = dzielenie(100, 25);
        System.out.println(wynik2);
        System.out.println(wynik3);
        System.out.println(wynik4);
        System.out.println(wynik5);
    }

    private static int dzielenie(int numberSeven, int numberEight) {
        return numberSeven / numberEight;
    }

    private static int mnozenie(int numberFive, int numberSix) {
        return numberFive * numberSix;
    }

    private static int odejmij(int numberThree, int numberFour) {
        return numberThree - numberFour;
    }

    private static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
