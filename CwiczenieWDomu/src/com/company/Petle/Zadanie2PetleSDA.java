package com.company.Petle;

// Utwórz metodę, w której pętlą wyświetlisz wszystkie liczby od 0 do wartości podanej przez użytkownika (przekazywanej jako parametr do tej metody)

import java.util.Scanner;

public class Zadanie2PetleSDA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres liczb do wypisania");
        int zakresLiczb = scanner.nextInt();
        System.out.print("Twoje liczby z podanego zakresu to: ");
        wynik(zakresLiczb);
    }

    private static void wynik(int zakresLiczb) {
        for (int i = 0; i <= zakresLiczb ; i++) {
            System.out.print(i);
            if (i < zakresLiczb) {
                System.out.print(", "); // sprawia ze po ostatniej nie ma przecinka
            }

        }
    }
}
