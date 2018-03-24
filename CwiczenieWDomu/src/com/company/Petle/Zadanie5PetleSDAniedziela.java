package com.company.Petle;

// Utwórz metodę, która przyjmuje dwa parametry oraz wyświetla ciąg elementów. Pierwszy parametr metody określa wyświetlany element,
// a drugi parametr liczbę wystąpień,

public class Zadanie5PetleSDAniedziela {
    public static void main(String[] args) {

        ciagElementow(9, 5);
    }

    private static void ciagElementow(int a, int b) {

        for (int i = 0; i < b; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
            }
            System.out.print("_");
        }
        System.out.println("\b"); // pozbywa sie ostatniego _
    }
}
