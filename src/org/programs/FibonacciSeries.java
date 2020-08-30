package org.programs;

public class FibonacciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int sum = 0;
        int n = 10;
        System.out.println(first);
        System.out.println(second);
        for(int i=0; i < n-2 ; i++) {
            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
        }
    }
}
