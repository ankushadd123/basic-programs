package org.programs;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] data = {4,3,6,7,1,0,6,9,6};
        sort(data, 0, data.length-1);
        System.out.println(Arrays.toString(data));

    }

    private static void sort(int[] data, int low, int high) {

        if(low < high) {
            int pivotPosition = divide(data, low, high);

            sort(data, low, pivotPosition - 1);
            sort(data, pivotPosition + 1, high);
        }
    }

    private static int divide(int[] data, int low, int high) {

       int pivot = data[high];

       int i = low-1;

       for (int j=low; j<high; j++) {
           if(data[j] < pivot) {
               i++;
               int temp = data[i];
               data[i] = data[j];
               data[j] = temp;
           }
       }
       int temp = data[high];
       data[high] = data[i+1];
       data[i+1] = temp;

       return i+1;

    }
}
