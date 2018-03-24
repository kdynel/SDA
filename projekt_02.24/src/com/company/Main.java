package com.company;

// to jest klasa:
public class Main {
    // to jest metoda:
    public static void main(String[] args) {
//        showMyName();
//        myNumber();
        numberRanges();
        alaMaKota();
        imiePies();
        liczenie();
        liczenie2();
        liczenie3();
        imie();
        dwieZmienne();

        int wynik = przekazywanieParametrow(2);
        System.out.println(wynik);
        System.out.println(przekazywanieParametrow(12));

    }

    private static int parametry(int i) {
        return 0;
    }

    static void showMyName() {
        System.out.println("Krzysiek");

    }

    static void myNumber() {
        System.out.println("My number: " + 666);
    }

    static void numberRanges() {
        System.out.println("Najmniejsza wartosc typu BYTE: " + Byte.MIN_VALUE);
        System.out.println("Największa wartość typu BYTE: " + Byte.MAX_VALUE);
        System.out.println("Najmniejsza wartosc typu INT: " + Integer.MIN_VALUE);
        System.out.println("Największa wartosc typu INT: " + Integer.MAX_VALUE);
        System.out.println("Najmniejsza wartość typu LONG: " + Long.MIN_VALUE);
        System.out.println("Największa wartość typu LONG: " + Long.MAX_VALUE);
        System.out.println("Najmniejsza wartosc typu DOUBLE: " + Double.MIN_VALUE);
        System.out.println("Największa wartosc typu DOUBLE: " + Double.MAX_VALUE);
        System.out.println("Najmniejsza wartosc typu FLOAT: " + Float.MIN_VALUE);
        System.out.println("Największa wartosc typu FLOAT: " + Float.MAX_VALUE);
        System.out.println("Najmniejsza wartość typu Double to: " + Double.MIN_VALUE);
//        System.out.printf("Zakres DOUBLE jest od %.0f do %.0f", Double.MIN_VALUE, Double.MAX_VALUE);
    }

    static void alaMaKota() {
        System.out.println("Ala ma \n kota");
        System.out.println("Ala ma \t kota");
        System.out.println("Ala ma \b kota");
        System.out.println("Ala ma \n ko\bta");
    }

    static void imiePies() {
        System.out.println("Mam na imie \"Kuba\", a mój pies nazywa się \\Azor\\");

    }

    private static void liczenie() {
        System.out.println(1 + 1 + "1"); //21
    }

    private static void liczenie2() {
        System.out.println("1" + 1 + 1); //111
    }

    private static void liczenie3() {
        System.out.println("1" + (1 + 1)); //12
    }

    private static void imie() {
        String imie = "Krzysiek";
        System.out.println(imie);
    }

    private static void dwieZmienne() {
        String imie = "Piotr";
        String nazwisko = "Kowalski";
        System.out.println("Imie Nazwisko = " + imie + " " + nazwisko);
    }

    private static int przekazywanieParametrow(int number) {
        return number * number * number;
    }


}

