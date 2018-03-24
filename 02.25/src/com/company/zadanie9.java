package com.company;

import java.util.Scanner;

public class zadanie9 { // podaj numer od 1 do 7, a dla każdego z nich przypisz odpowiedni dzień tygodnia zaczynając od poniedziałku itd

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer dnia tygodnia od 1 do 7: ");
        int numerDniaTygodnia = scanner.nextInt();
        switch (numerDniaTygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;

                default:
                    System.out.println("Błędny numer");
        }
    }
}
