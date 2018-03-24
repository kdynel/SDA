/*
Utwórz metodę, która przyjmuje trzy parametry (imie String , wiek int , płeć boolean ) i zwróci informację (w
fomie zdania - typu String ). Nowa metoda zwrócić wartość, a nie wyświetlać!
Dla przekazanych parametrów Maciej, 88, true , powinno zwrócić
Cześć! Jestem Maciej, mam 88 lat i jestem mężczyzną
Dla przekazanych parametrów Kasia, 23, false , powinno zwrócić
Cześć! Jestem Kasia, mam 23 lat i jestem kobietą
EXTRA Dodać odpowiednie odmienia słowa lat , czyli 6 lat ale 43 lata .



package com.company;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie");
        String yourName = scanner.nextLine();

        System.out.println("Podaj wiek");
        int yourAge = scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Jeśli jesteś mężczyzną wpisz \"true\", jeśli kobietą wpisz \"false\"");
        boolean yourSex = scanner.nextBoolean;
        System.out.println(introduction(yourName, yourAge, yourSex));
    }

    private static String introduction(String yourName, int yourAge, boolean yourSex) {
        return String.format("Cześć! Jestem %s, mam %s %s i jestem %s", yourName, yourAge, yourSex ? "mężczyzną" : "kobietą");
    }
}

 */

