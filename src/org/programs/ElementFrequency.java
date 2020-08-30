package org.programs;

public class ElementFrequency {

    public static void main(String[] args) {

        int[] data = {1, 1, 0, 6, 8, 7, 6, 9, 40, 44, 40, 6, 67, 8};
        boolean[] visited = new boolean[data.length];
        int count = 0;
        for(int i=0; i<data.length; i++) {
            count = 0;
            if(visited[i] == true)
                continue;
            for(int j = i+1; j<data.length; j++) {
                if(data[i] == data[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            count++;
            System.out.println(data[i]+" occurs "+count+" times");
        }


    }
}
