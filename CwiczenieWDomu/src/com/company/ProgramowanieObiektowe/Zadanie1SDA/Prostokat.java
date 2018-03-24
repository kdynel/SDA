package com.company.ProgramowanieObiektowe.Zadanie1SDA;

public class Prostokat {

    int dluzszyBok;
    int krotszyBok;

    Prostokat(int dluzszyBok, int krotszyBok){
        this.dluzszyBok = dluzszyBok;
        this.krotszyBok  = krotszyBok;
    }

    int policzenieObwodu() {
        int wynik = (dluzszyBok * 2) + (krotszyBok * 2);
        return wynik;
    }

    int policzeniePowierzchni (){
        int wynik = dluzszyBok * krotszyBok;
        return wynik;
    }
    static boolean porownaniePola(Prostokat prostokat, Prostokat prostokat2){
        return prostokat.policzeniePowierzchni() == prostokat2.policzeniePowierzchni();


        //        if (prostokat.policzeniePowierzchni() == prostokat2.policzeniePowierzchni()) {
//            return true;
//        }
//        return false;
    }
}


