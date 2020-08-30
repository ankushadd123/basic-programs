package org.programs;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element to search : ");
        int test = scanner.nextInt();
        int[] data = { 3, 5, 6, 8, 99, 300 };

        find(data, 0, data.length-1, test);
        System.out.println("Element not found");

    }

    private static void find(int[] data, int low, int high, int test) {

        int mid = (low + high) / 2;

        if(low <= high) {
            if (data[mid] == test) {
                System.out.println("Element found at index : " + mid);
                System.exit(1);
            }

            if (test < data[mid])
                find(data, 0, mid - 1, test);
            else
                find(data, mid + 1, high, test);
        }

    }
}
