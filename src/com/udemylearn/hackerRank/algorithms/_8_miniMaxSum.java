package com.udemylearn.hackerRank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class _8_miniMaxSum {
    public static void main(String[] args) {

        List<Integer> arr = miniMaxArray();
        // Write your code here
        long sum = 0;
        int min = arr.get(0);
        int max = arr.get(0);
        for(int i:arr){
            sum +=i;
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        // since List(or arrayLists are members of Collections)
        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static List<Integer> miniMaxArray(){
        List<Integer> arr = new ArrayList<>();
        arr.add(396285104);
        arr.add(573261094);
        arr.add(759641832);
        arr.add(819230764);
        arr.add(364801279);

        return arr;
    }
}
