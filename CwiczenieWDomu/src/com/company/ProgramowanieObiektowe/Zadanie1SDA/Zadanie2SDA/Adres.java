package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie2SDA;

// Utwórz klasę Address (Adres) posiadającą
//
//    pola reprezentujące:
//
//        ulicę
//        numer domu
//        numer mieszkania
//        kod pocztowy
//        miasto
//
//
//    następujące kostruktory:
//
//        bezparametrowy
//        3-parametrowy (przyjmujący pierwsze trzy pola)
//        5-parametrowy (przyjmujący wszystkie pola)
//
//    metody zwracające:
//
//        pełen adres
//        ulicę (wraz z numerami)

public class Adres {

    String ulica;
    int numerDomu;
    int numerMieszkania;
    int kodPocztowy;
    String miasto;

    public Adres(String ulica, int numerDomu, int numerMieszkania) { // konstruktor trzy parametrowy, konstruktora bezparametrowego nie musze pisać
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
    }

    public Adres(String ulica, int numerDomu, int numerMieszkania, int kodPocztowy, String miasto) { // konstruktor piecioparametrowy
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    String pelenAdres() {
        return ulica + " " + numerDomu + " " + numerMieszkania + " " + kodPocztowy + " " + miasto;
    }
    String ulica(){
        return ulica + " " + numerDomu + " " + numerMieszkania;
    }

}
