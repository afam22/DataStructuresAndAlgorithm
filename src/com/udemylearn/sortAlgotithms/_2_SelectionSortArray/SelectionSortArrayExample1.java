package com.udemylearn.sortAlgotithms._2_SelectionSortArray;

import java.util.Arrays;

public class SelectionSortArrayExample1 {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(intArray));

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largestIndex = 0;
            //looking for largest element
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largestIndex]){
                    largestIndex = i;
                }
            }
            performSwap(intArray, largestIndex, lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(intArray));
    }

    // swap largest number to the end of the array
    private static void performSwap(int[] array, int n1, int n2){
        if (n1 == n2){
            return; // do not perform swap
        }
        // swap operation below
        int temp = array[n1];
        array[n1] = array[n2];
        array[n2] = temp;
    }
}
