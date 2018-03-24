package com.company.IFowanie;

// Utwórz metodę, do której przekazujesz jeden parametr a ona zwraca informacje jak daleko jest ta liczba od przedziału
// 11 - 22 (tzn. o ile należy większyć lub zmniejszyć podany parametr by "trafić w przedział")

public class Zadanie3IfSDAniedziela {
    public static void main(String[] args) {
        int jedenParametr = 20;

        int wynik = sprawdzParametr(jedenParametr);
        System.out.println(wynik);
    }

    private static int sprawdzParametr(int jedenParametr) {
        if (jedenParametr >= 11 && jedenParametr <= 22) {
            return 0;
        } else if (jedenParametr < 11) {
            return 11 - jedenParametr;
        } else {
            return 22 - jedenParametr;
        }
    }
}


/*
    private static int checkScope(int value) {
        if (value < 11 && value > 22) {


        }
  //  }
}
*/

/*

public static void main(String[] args) {

        System.out.println(checkScope(20));

        System.out.println(checkScope(5));

        System.out.println(checkScope(100));
        System.out.println(checkScope(200));


    }

    private static int checkScope(int value) {
        if (value >= 11 && value <= 22) {
            return 0;
        } else if (value < 11) {
            return 11 - value;
        } else {
            return 22 - value;
        }
    }
 */