package com.udemylearn.sortAlgotithms._1_bubbleSortArray;

// Ascending

import java.util.Arrays;

public class BubbleSortArrayExample1 {
    public static void main(String[] args) {
        int[] listOfNumbers = {20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(listOfNumbers));

        for (int lastUnsortedIndex = listOfNumbers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if (listOfNumbers[i] > listOfNumbers[i+1]){
                    performSwap(listOfNumbers, i, (i+1));
                }
            }
        }
        System.out.println(Arrays.toString(listOfNumbers));
    }

    private static void performSwap(int[] array, int n1, int n2){
        if (n1 == n2){
            return; // do not perform swap
        }

        int temp = array[n1];
        array[n1] = array[n2];
        array[n2] = temp;

    }
}
