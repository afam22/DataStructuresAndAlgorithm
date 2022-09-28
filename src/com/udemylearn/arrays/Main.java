package com.udemylearn.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*        int multiplier = 1; int factorial = 1; int num = 3;

        while (multiplier <= num){
            factorial = factorial * multiplier;
            multiplier++;
        }
        System.out.println("\nFactorial of " + num + " is: " + factorial);*/


        int[] myArray = arrayExample();
        System.out.println(Arrays.toString(myArray));
//        int index = retrieveIndex(myArray,-22);
//        System.out.println("index = " + index);
    }

    public static int[] arrayExample(){
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        return intArray;
    }

    public static void printArray(int[] array){
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static int retrieveIndex(int[] arrayToRetrieveIndex, int number){
        int index = -1;
        for (int i=0; i<arrayToRetrieveIndex.length; i++){
            if (arrayToRetrieveIndex[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }
}
