/* Utwórz metodę, która przyjmuje wartość produktu oraz procent podatku jaki należy naliczyć, a następnie zwraca
kwotę po opodatkowaniu.
Dla przekazanych parametrów 100, 23 , powinno zwrócić 123
Dla przekazanych parametrów 100, 8 , powinno zwrócić 108
*/

package com.company;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj liczbę do oprocentowania:");
        double a = scanner.nextDouble();
        System.out.println("Podaj wartość podatku do naliczenia 8% lub 23%");
        double b = scanner.nextDouble();
        double wynik = wynikZPodatkiem(a,b);
        System.out.println(wynik);
    }

    public static double wynikZPodatkiem (double a, double b) {
        if (b == 8){ // czemu tu musi być == a nie = ? // czemu tu jest if skoro jest double a nie boolean?
            return a * 1.08;
        } else if (b == 23){
            return a * 1.23;
        }
        else {
            System.out.println("Zła wartość podatku");
        }
        return a;
    }
}
