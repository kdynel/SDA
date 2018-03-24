package com.company.IFowanie;

// Utwórz metodę, która przyjmuje dwa parametry - pierwszy to prędkość z jaką poruszał się Twój pojazd, a drugi to dopuszczalna prędkość. Metoda
// ma zwrocić wartość mandatu w przypadku przekroczenia dopuszczalnej prędkości. Każde przekroczenie o rozpoczęte 10 km/h to 100zł. Przykłady:

public class Zadanie4IfSDAniedziela {
    public static void main(String[] args) {
        int predkoscAuta = 90;
        int dopuszczalnaPredkosc = 50;


        int mandat = wartoscMandatu(predkoscAuta, dopuszczalnaPredkosc);
        System.out.print("Twój mandat wynosi " + mandat + "zł");
    }

    private static int wartoscMandatu(int predkoscAuta, int dopuszczalnaPredkosc) {
        if (predkoscAuta <= dopuszczalnaPredkosc) {
            return 0;
        } else if (predkoscAuta > dopuszczalnaPredkosc) {
            return (((predkoscAuta - dopuszczalnaPredkosc) / 10) * 100);
        } else {
            return 0;
        }
    }
}
