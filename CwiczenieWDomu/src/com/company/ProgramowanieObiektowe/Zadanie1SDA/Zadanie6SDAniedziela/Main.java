package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie6SDAniedziela;

import com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie5SDAniedziela.Pracownik;

public class Main {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("Waław", "Kowalski", true);
        Pracownik p2 = new Pracownik("Marzena", "Sobczak", false);
        Pracownik p3 = new Pracownik("Marlena", "Sobczakowska", false);
        Pracownik p4 = new Pracownik("Paweł", "Zientarska", false);

        Firma mojaFirma = new Firma();

        mojaFirma.dodajPracownika(p1);

        mojaFirma.dodajPracownika(new Pracownik("YY","xx", false));

        Pracownik zwroconyPracownik = mojaFirma.wyswietlPracownikaPrzezID(1);

        System.out.println("Tutaj jest info o zwroconym pracowniku, imie: " + zwroconyPracownik.getImie());

    }
}
