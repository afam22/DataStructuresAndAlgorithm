package com.udemylearn.hackerRank.algorithms;

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference
Input Format

The first line contains a single integer, , the number of rows and columns in the square matrix .
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
 */

//Note that this code has only the solution, i have not been able to sort the driver class
import java.util.ArrayList;
import java.util.List;

public class _05_diagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> array = new ArrayList();
        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);

        List<Integer> row2 = new ArrayList<>();
        row1.add(4);
        row1.add(5);
        row1.add(6);

        List<Integer> row3 = new ArrayList<>();
        row1.add(10);
        row1.add(8);
        row1.add(-12);

        array.add(row1);
        array.add(row2);
        array.add(row3);

//        int diff = diagonalDifference(array);
//        System.out.println(diff);
    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here ====>
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.size();

        for(int i=0; i < n; i++){
            sum1 += arr.get(i).get(i);
        }
        for(int i=0; i < n; i++){
            sum2 += arr.get(i).get(n - (i+1));
        }
        return Math.abs(sum1 - sum2);

    }
}
