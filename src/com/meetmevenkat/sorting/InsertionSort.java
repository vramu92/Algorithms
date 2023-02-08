package com.meetmevenkat.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int integers[] = {10, -12, 35, 22, -21, 55, 4};
        insertionSort(integers, integers.length);
        /*for(int i=1; i<integers.length; i++){
            int temp = integers[i];
            int j;
            for(j=i; j>0 && integers[j-1] > temp; j--){
                integers[j] = integers[j-1];
            }

            integers[j] = temp;
        }*/

        for (int i=0; i<integers.length; i++){
            System.out.println(integers[i]);
        }
    }

    private static void insertionSort(int[] input, int numItems){
        if(numItems < 2){
            return;
        }

        insertionSort(input, numItems-1);
        int temp = input[numItems-1];
        int j;
        for(j=numItems-1; j>0 && input[j-1] > temp; j--){
            input[j] = input[j-1];
        }

        input[j] = temp;

    }
}
