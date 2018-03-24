package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie1SDAniedziela;

// Utwórz klasę Rownanie służącą do policzenia rownania a^2 + b^3 + c^4. Klasa powinna zawierać:
//
//    pola:
//
//        a, b, c
//
//
//    kostruktory:
//
//        bezparametrowy
//        3-parametrowy
//
//    metody:
//
//        liczaca wartosc rownania
//        przyjmującą liczbę a następnie zwracająca informację (boolean) czy wartość równania przekroczyła podaną liczbą (jako parametr)

public class Rownanie {

    int a, b, c;

    public Rownanie(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double policzWartosc(){
        double wynik = Math.pow(a, 2) + Math.pow(b, 3) + Math.pow(c, 4);
        return wynik;
    }
    boolean sprawdzLiczbe(int d){
        if(policzWartosc() > d) {
            return true;
        } else {
            return false;
        }
    }
}
