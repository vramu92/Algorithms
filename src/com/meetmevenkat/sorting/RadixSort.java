package com.meetmevenkat.sorting;

public class RadixSort {

    public static void main(String[] args) {
        int integers[] = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(integers, 10, String.valueOf(integers[0]).length());

        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }

    private static void radixSort(int[] input, int radix, int width){
        for(int position=0; position<width; position++){
            radixSingleSort(input, radix, position);
        }
    }

    private static void radixSingleSort(int[] input, int radix, int position) {
        int numItems = input.length;
        int[] countArray = new int[radix];
        for(int value: input){
            countArray[getDigit(value, position, radix)]++;
        }

        for(int i=1; i<countArray.length; i++){
            countArray[i] += countArray[i-1];
        }

        int[] tempArray = new int[numItems];
        for(int tempIndex = numItems-1; tempIndex >= 0; tempIndex--){
            tempArray[--countArray[getDigit(input[tempIndex], position, radix)]] = input[tempIndex];
        }

        for(int i=0; i<tempArray.length; i++){
            input[i] = tempArray[i];
        }
    }

    private static int getDigit(int value, int position, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }
}
