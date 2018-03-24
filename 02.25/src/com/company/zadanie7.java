package com.company;

import java.util.Scanner;

public class zadanie7 { // utwórz metodę do której przekazujesz 3 parametry,  czego pierwsze dwa to przedział. Metoda powinna
    // zwrócić info czy trzecia liczba zawiera sie w tym przedziale.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe A do sprawdzenia");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe B do sprawdzenia");
        int b = scanner.nextInt();
        System.out.println("Podaj liczbe C do sprawdzenia");
        int c = scanner.nextInt();

        boolean czyMiesciSieWPrzedziale = znajdzPrzedział(a,b,c);

        System.out.println("Czy trzecia jest w przedziale: " + czyMiesciSieWPrzedziale);
    }



    private static boolean znajdzPrzedział(int a, int b, int c) {
        if (c >= a && c <= b) {
            return true;
        } else {
            return false;
        }
    }

}


