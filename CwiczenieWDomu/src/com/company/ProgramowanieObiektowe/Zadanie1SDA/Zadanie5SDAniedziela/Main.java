package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie5SDAniedziela;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Marcin", "Kowalski", true );
        System.out.println(pracownik.zwrocImieNazwiskoPlec());
        System.out.println(pracownik.wyswietlPlec());
        System.out.println(pracownik.liczbaLatDoEmerytury(20));
        Pracownik pracownik2 = new Pracownik("Aneta", "Kowalska", false);
        System.out.println(pracownik2.zwrocImieNazwiskoPlec() + " " + pracownik2.wyswietlPlec() + " " + pracownik2.liczbaLatDoEmerytury(25));

        Pracownik pracownik3 = new Pracownik("Jan", "Kowalski", true);
        pracownik3.imie = "Piotr";
        System.out.print(pracownik3.zwrocImieNazwiskoPlec() + " " + pracownik3.wyswietlPlec() + " " + pracownik3.liczbaLatDoEmerytury(25));

    }
}
