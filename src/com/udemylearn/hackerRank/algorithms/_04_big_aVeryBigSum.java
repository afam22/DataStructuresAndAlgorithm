package com.udemylearn.hackerRank.algorithms;

import java.util.ArrayList;
import java.util.List;

/*
In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Function Description

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):

int ar[n]: an array of integers .
Return

long: the sum of all array elements
Input Format

The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.

Output Format

Return the integer sum of the elements in the array.

Constraints


Sample Input

5
1000000001 1000000002 1000000003 1000000004 1000000005
 */
public class _04_big_aVeryBigSum {
    public static void main(String[] args) {
        List<Long> array = new ArrayList<>();
        array.add(1000000001L);
        array.add(1000000002L);
        array.add(1000000003L);
        array.add(1000000004L);
        array.add(1000000005L);

        long result = aVeryBigSum(array);
        System.out.println(result);
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here => RESULT
        long sum = 0;
        for (long i : ar)
            sum += i;
        return sum;
    }

}
