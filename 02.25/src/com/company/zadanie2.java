package com.company;

public class zadanie2 {


    public static void main(String[] args) {
        int liczba1 = 10;
        int liczba2 = 10;
        int liczba3 = 10;

        boolean sprawdzWynik = sprawdz (liczba1, liczba2, liczba3);
        System.out.println(sprawdzWynik);

    }

    private static boolean sprawdz(int liczba1, int liczba2, int liczba3) {
        if (liczba1 == liczba2 && liczba2 == liczba3){
            return true;
        } else {
            return false;
        }
    }
}
