package com.company.Petle;

// Utwórz metodę, w której pętlą (typu FOR) wyświetlisz wszystkie liczby od 0 do 18 (włącznie).

public class Zadanie1PetleSDA {
    public static void main(String[] args) {

        wyswietlLiczby();
    }

    private static void wyswietlLiczby() {
        for (int i = 0; i <= 18 ; i++) {
            System.out.print(i);
            if (i < 18) {
                System.out.print(", ");
            }

        }
    }
}


     /*   wyswietl();
    }

    private static void wyswietl() {
        for (int i = 0; i <= 18 ; i++) {
            System.out.print(i);

            if (i < 18) {
                System.out.print(", ");
            }


        }
    }
}
*/
