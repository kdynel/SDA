package com.company;

public class If {

    public static void main(String[] args) {
// zadanie1: utwórz metode do której prekazujesz jeden parametr i zwracana jest informacja cy liczna jest wieksza lub równa od 20
        boolean result = checkIfGreat(100);
        System.out.println(result);
        boolean result2 = checkIfGreat(10);
        System.out.println(result2);

    }

    private static boolean checkIfGreat(int number) {
        if (number >= 20) {
            return true;
        } else {
            return false;
        }
    }
        // zadanie2: utwórz metode do której przekazujesz dwa parametry a ona zwróci jeden z nich
/*
        int firstValue = 6;
        int secondValue = 3;
        int returnedValue = compareAndReturnNumber(firstValue, secondValue);
        System.out.println(returnedValue);


    }

    private static int compareAndReturnNumber(int firstValue, int secondValue) {
        if (firstValue <= secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }
}*/
// zadanie 3: utwórz metode do której przekazujesz 3 parametry a ona zwróci najwiekszy z nich
/*
        int firstValue = 3;
        int secondValue = 2;
        int thirdValue = 1;
        int returnedValue = compareAndReturnNumber(firstValue, secondValue, thirdValue);
        System.out.println(returnedValue);
    }

    private static int compareAndReturnNumber(int firstValue, int secondValue, int thirdValue) {
        if (firstValue >= secondValue && firstValue >= thirdValue) {
            return firstValue;
        } else if (secondValue >= firstValue && secondValue >= thirdValue) {
            return secondValue;
        } else {
            return thirdValue;


        }
    }
} */
/* zadanie 4: utwórz metode która zwróci informacje (boolean) czy przekazana liczba (int) jest parzysta czy nie

        int liczba = 11;
        boolean wynik = czyParzysta(liczba);

        if (wynik) {
            System.out.printf("Liczba '%s' JEST parzysta", liczba);
        } else {
            System.out.printf("Liczba '%s' JEST nieparzysta", liczba);
        }
    }

    private static boolean czyParzysta(int liczba) {

        if (liczba % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
} */







        /*boolean result = parzysta(10);
        boolean result = nieparzysta ()
        {
            System.out.println(result);

            private static void parzysta ( int number);
            private static void nieparzysta (int )
            {

                if (number%2==0) {
                    return parzysta;
                } else {
                    return nieparzysta
                }
                }
            }
        }
    }*/