package com.meetmevenkat.sorting;

public class ShellSort4 {

    public static void main(String[] args) {
        int integers[] = {10, -12, 35, 22, -21, 55, 4};

        for(int gap=integers.length/2; gap>0; gap /=2){
            for(int j=gap; j<integers.length; j++){
                int swapValue = integers[j];
                int i=j;
                while(i>=gap && integers[i-gap] > swapValue){
                    integers[i] = integers[i-gap];
                    i -= gap;
                }

                integers[i] = swapValue;
            }
        }


        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }
}
