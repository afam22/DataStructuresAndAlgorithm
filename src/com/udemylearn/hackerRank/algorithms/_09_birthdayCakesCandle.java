package com.udemylearn.hackerRank.algorithms;

import java.util.ArrayList;
import java.util.List;

/*
You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example


The maximum height candles are  units high. There are  of them, so return .

Function Description

Complete the function birthdayCakeCandles in the editor below.

birthdayCakeCandles has the following parameter(s):

int candles[n]: the candle heights
Returns

int: the number of candles that are tallest
Input Format

The first line contains a single integer, , the size of .
The second line contains  space-separated integers, where each integer  describes the height of .
 */
public class _09_birthdayCakesCandle {
    public static void main(String[] args) {
        List<Integer> candles = array();
        int n = candles.size();
        int highestHeight = candles.get(0);
        int count = 0;
        // obtain highest candle height
        for (int i=0; i < n; i++){
            if(highestHeight < candles.get(i)){
                highestHeight = candles.get(i);
            }
        }
        for (int i=0; i < n; i++){
            if (candles.get(i) == highestHeight){
                count++;
            }
        }
        System.out.println(count);

    }

    public static List<Integer> array(){
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(3);
        return arr;
    }
}
