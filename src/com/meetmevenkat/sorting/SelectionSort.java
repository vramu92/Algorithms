package com.meetmevenkat.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int integers[] = {10, -12, 35, 22, -21, 55, 4};
        for(int i=integers.length-1; i>0; i--){
            int largestValueIndex = 0;
            for(int j=1; j<=i; j++){
                if(integers[j] > integers[largestValueIndex])
                    largestValueIndex = j;
            }
            swapElements(integers, largestValueIndex, i);
        }

        for(int i=0; i<integers.length; i++){
            System.out.println(integers[i]);
        }
    }


    private static void swapElements(int[] unsortedArray, int i, int j){
        if(i == j)
            return;
        int temp = unsortedArray[j];
        unsortedArray[j] = unsortedArray[i];
        unsortedArray[i] = temp;

    }
}
