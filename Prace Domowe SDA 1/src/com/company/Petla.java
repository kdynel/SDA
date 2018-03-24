package com.company;

// apisz program, który pobierze od użytkownika całkowitą liczbę dodatnią. Następnie przy użyciu wyświetl na ekranie Odliczanie z tekstem
// "Bomba wybuchnie za ... " gdzie w miejsce dwukropka mają się pojawić liczby od podanej przez użytkownika do 0.

import java.util.Scanner;

public class Petla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bomba wybuchnie za: ");
        int sekundy = scanner.nextInt();
        zegar(sekundy);

    }

    private static void zegar(int sekundy) {
        System.out.print("Bomba wybuchnie za ");
        for (int i = sekundy; i > 0; i--) {
            System.out.print(i + "...");

        }
        System.out.println("BUM!");
    }


}

