package com.meetmevenkat.sorting;

public class radixSortExample {

    public static void main(String[] args) {
        String strings[] = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb", "aagsd"};

        radixSort(strings, 26, strings[0].length());

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    private static void radixSort(String[] input, int radix, int width){
        for(int position=width-1; position >= 0; position--){
            radixSingleSort(input, radix, position);
        }
    }

    private static void radixSingleSort(String[] input, int radix, int position) {
        int numItems = input.length;
        int[] countArray = new int[radix];
        for(String value: input){
            countArray[getDigit(value, position)]++;
        }

        for(int i=1; i<countArray.length; i++){
            countArray[i] += countArray[i-1];
        }

        String[] tempArray = new String[numItems];
        for(int tempIndex = numItems-1; tempIndex >= 0; tempIndex--){
            tempArray[--countArray[getDigit(input[tempIndex], position)]] = input[tempIndex];
        }

        for(int i=0; i<tempArray.length; i++){
            input[i] = tempArray[i];
        }
    }

    private static int getDigit(String value, int position) {
        return value.charAt(position)-'a';
    }
}
