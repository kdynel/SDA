package com.company;

public class Test {
    public void main() {

        int x = 1;
        int y = 2;

        boolean higher = isHigher(x, y);

        if (higher) {

        }

    }

    private boolean isHigher(int a, int b) {
        boolean result = a > b;

        return result;
    }

}
