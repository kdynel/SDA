package com.company; // Utwórz metodę, która przyjmuje dwa parametry oraz *wyświetla*
// ciąg elementów. Pierwszy parametr metody określa wyświetlany element, a drugi parametr liczbę wystąpień,

public class ciagZnakow {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        wyswietlCiag(a,b);

    }

    private static void wyswietlCiag(int a, int b) {
        for (int i = 1; i <= b ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(a);
                
            }
            System.out.print("_");
        }
        System.out.print("\b");
    }
    
}
