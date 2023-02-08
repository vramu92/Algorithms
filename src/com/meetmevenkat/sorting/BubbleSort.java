package com.meetmevenkat.sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int unsortedArray[] = {10, -12, 35, 22, -21, 55, 4};
        for(int i = unsortedArray.length-1; i > 0; i--){
            for(int j=0; j<i; j++){
                if(unsortedArray[j] > unsortedArray[j+1]){
                    swapElements(unsortedArray, j, j+1);
                }
            }
        }
        for(int i=0; i<unsortedArray.length; i++){
            System.out.println(unsortedArray[i]);
        }

    }

    private static void swapElements(int[] unsortedArray, int i, int j) {
        if (i == j)
            return;
        int temp = unsortedArray[j];
        unsortedArray[j] = unsortedArray[i];
        unsortedArray[i] = temp;
    }
}
