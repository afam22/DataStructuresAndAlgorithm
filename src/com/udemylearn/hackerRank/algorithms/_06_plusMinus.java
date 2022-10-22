package com.udemylearn.hackerRank.algorithms;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example

There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

0.400000
0.400000
0.200000
 */
public class _06_plusMinus {
    public static void main(String[] args) {
        List<Integer> arr = array();
        plusMinus(arr);
    }
    public static List<Integer> array(){
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        return arr;
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i=0; i < arr.size(); i++){
            if(arr.get(i) == 0){          //check for numbers of zero
                zero ++;
            } else if (arr.get(i) > 0) {  //check for numbers of positive
                positive ++;
            } else if(arr.get(i) < 0){   //check for numbers of negative
                negative ++;
            }
        }
        //divide by number of positives by array size
        double result1 = (positive*1.0)/arr.size();
        System.out.format("%.6f", result1);
        System.out.println("");
        double result2 = (negative*1.0)/arr.size();
        System.out.format("%.6f", result2);
        System.out.println("");
        double result3 = (zero*1.0)/arr.size();
        System.out.format("%.6f", result3);
    }
}
