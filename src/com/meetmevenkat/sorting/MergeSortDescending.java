package com.meetmevenkat.sorting;

public class MergeSortDescending {

    public static void main(String[] args) {
        int integers[] = {10, -12, 35, 22, -21, 55, 4};

        mergeSort(integers, 0, integers.length);

        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }

    private static void mergeSort(int[] input, int start, int end){

        if(end-start < 2){
            return;
        }

        int mid = (start + end) /2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {

        if(input[mid-1] > input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int[] tempArray = new int[end-start];
        int tempIndex = 0;

        while(i<mid && j<end){
            tempArray[tempIndex++] = input[i]>input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(tempArray, 0, input, start, tempIndex);
        
    }
}
