package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie3SDA;

// Utwórz klasę Date (Data) posiadającą
//
//    pola reprezentujące:
//
//        dzień
//        miesięc
//        rok
//
//    następujące kostruktory:
//
//        bezparametrowy
//        3-parametrowy (przyjmujący wszystkie parametry)
//
//
//    metody umożliwiające:
//
//        ustawienie dnia (wraz ze sprawdzaniem poprawności) - zwracająca typ boolean
//        ustawienie miesiąca (wraz ze sprawdzaniem poprawności) - zwracająca typ boolean
//        ustawienie roku (wraz ze sprawdzaniem poprawności) - zwracająca typ boolean
//        wyświetlenie daty w formacie dzien-miesiac-rok (opcjonalnie z możliwością ustawienia separatora)
//        wyświetlenie daty w formacie rok-miesiac-dzien (opcjonalnie z możliwością ustawienia separatora)
//        przesunięcie daty o wybraną liczbę dni

public class Date {
    int dzien;
    int miesiac;
    int rok;

    public Date(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }
    boolean ustawienieDnia(int dzien){
        if(dzien <= 31) {
            System.out.println("Dzień jest poprawny");
            return true;
        } else {
            System.out.println("Dzień jest niepoprawny");
            return false;
        }
    }
    boolean ustawienieMiesiaca(){
        if (miesiac <= 12) {
            return true;
        } else {
            return false;
        }
    }
    boolean ustawienieRoku(){
        if (rok <= 2018) {
            return true;
        } else {
            return false;
        }
    }
    String dzienMiesiacRok(){

        return dzien + "-" + miesiac + "-" + rok;
    }
    String rokMiesiacDzien(){

        return rok + "-" + miesiac + "-" + dzien;
    }


}
