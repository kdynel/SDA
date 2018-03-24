package com.company.IFowanie;

// Utwórz metodę, która przyjmuje 4 parametry i zwraca wynik wynik równania:
// a^(x) + b^(x+1) + c^(x+2). Gdzie a, b, c to pierwsze trzy parametry, a x jest czwartym parametrem.
// 1, 2, 3, 8 powinno policzyć 1^8 + 2^9 + 3^10

public class Zadanie8IfSDA {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double x = 8;
        System.out.println(sprawdzRownanie(a, b, c, x));

    }

    private static double sprawdzRownanie(double a, double b, double c, double x) {
        a = Math.pow(a, x); // najpierw liczba którą chcesz potęgować a potem przez którą chcesz potęgować
        b = Math.pow(b, x + 1);
        c = Math.pow(c, x + 2);
        double wynik = a + b + c;
        return wynik;

    }
}
