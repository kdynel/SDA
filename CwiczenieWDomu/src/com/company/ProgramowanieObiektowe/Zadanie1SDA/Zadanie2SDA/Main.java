package com.company.ProgramowanieObiektowe.Zadanie1SDA.Zadanie2SDA;

public class Main {
    public static void main(String[] args) {

        Adres adres = new Adres("Częstochowska", 64, 45, 93121, "Lodz");
        System.out.println(adres.pelenAdres());
        Adres adres2 = new Adres("Częstochowska", 64, 45);
        System.out.println(adres2.ulica());
    }
}
