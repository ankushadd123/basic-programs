package org.programs;

public class SwapWithThird {

    public static void main(String[] args) {

        int a = 3;
        int b = 7;

        System.out.println("Before swapping : [ a = "+a+", b = "+b+" ]");

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : [ a = "+a+", b = "+b+" ]");
    }
}
