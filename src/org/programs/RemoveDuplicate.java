package org.programs;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] data = {3, 3, 6, 7, 7, 6, 1};
        int[] result = new int[data.length];
        boolean[] visited = new boolean[data.length];
        int currentIndexOfResult = -1;

        for (int i=0; i<data.length; i++) {

            if (visited[i])
                continue;
            if(i==0) {
                currentIndexOfResult++;
                result[currentIndexOfResult] = data[i];
                visited[i] = true;
            }
            for(int j=i+1; j<data.length; j++){
                if(data[i] == data[j])
                    visited[j] = true;
            }
            if(!visited[i]) {
                currentIndexOfResult++;
                result[currentIndexOfResult] = data[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
