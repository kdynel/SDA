package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie6SDAniedziela;

// Utwórz klasę Company (Firma) posiadającą listę (ArrayList()) osób (z powyższego zadania) oraz metody umożliwiające:
//
//        wyświetlenie listy pracowników
//        zwrócenie pracownika który zarabia najwięcej
//        zwrócenie najstarszego pracownika
//        zwrócenie liczby pracowników starszych niż podana wartość
//        przyznanie podwyżki procentowej (np. podnieść wszystkim o 10%)
//        przyznanie podwyżki kwotowej (np. wszystkim o 500 zł)

import com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie5SDAniedziela.Pracownik;

import java.util.ArrayList;

public class Firma {

    ArrayList<Pracownik> employeeList = new ArrayList<>();

    void dodajPracownika(Pracownik p){
        employeeList.add(p);
    }

    Pracownik wyswietlPracownikaPrzezID(int idPracownika){
        return employeeList.get(idPracownika);
    }
}
