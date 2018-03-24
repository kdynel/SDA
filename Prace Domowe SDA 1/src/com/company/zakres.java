package com.company;

// podaj dwie liczby do programu a on niech zwróci zakres liczb miedzy nimi ZROBIONE

import java.util.Scanner;

public class zakres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę dla zakresu liczb");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę dla zakresu liczb");
        int b = scanner.nextInt();
        System.out.print("Zakres liczb wynosi: ");
        podajZakres (a,b);

    }

    private static void podajZakres(int a, int b) {
        for (int i = a; i < b ; i++) { // czemu i musi byc = a a nie > aby wyswietlało zakres bez podanych liczb a tylko miedzy nimi
            System.out.print(i + ", ");

        }
    }
}
