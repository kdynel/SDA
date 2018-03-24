package com.company;

public class Main {

    public static void main(String[] args) {
        int firstValue = 100;
        int secondValue = 20;
        int thirdValue = 30;
        int returnedValue = compareAndReturnNumber(firstValue, secondValue, thirdValue);
        System.out.println(returnedValue);
    }

    private static int compareAndReturnNumber(int firstVaulue, int secondValue, int thirdValue) {
        if (thirdValue > secondValue && thirdValue > firstVaulue) {
            return thirdValue;
        } else {
            return secondValue;
        }

    }
}






/*
 private static int compareAndReturnNumber(int firstValue, int secondValue, int thirdValue) {
        if (firstValue >= secondValue && firstValue >= thirdValue) {
            return firstValue;
        } else if (secondValue >= firstValue && secondValue >= thirdValue) {
            return secondValue;
        } else {
            return thirdValue;
 */
