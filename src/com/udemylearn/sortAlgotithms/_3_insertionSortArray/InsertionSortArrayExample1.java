package com.udemylearn.sortAlgotithms._3_insertionSortArray;

import java.util.Arrays;

public class InsertionSortArrayExample1 {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(intArray));
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){// to arrange in descending order, change the sign intArray[i - 1] < newElement to <
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
