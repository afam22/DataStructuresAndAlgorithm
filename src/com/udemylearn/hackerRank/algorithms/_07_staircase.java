package com.udemylearn.hackerRank.algorithms;

/*
Staircase detail

This is a staircase of size :

   #
  ##
 ###
####
Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Function Description

Complete the staircase function in the editor below.

staircase has the following parameter(s):

int n: an integer
Print

Print a staircase as described above.

Input Format

A single integer, , denoting the size of the staircase.

Note: The last line must have  spaces in it.
 */
public class _07_staircase {
    public static void main(String[] args) {
        int noOfSteps = 6;
        staircase(noOfSteps);
    }
    /*
     n = 4   /num of spaces/ num of symbols(#)
     ___#         3              1
     __##         2              2
     _###         1              3
     ####         0              4
     */

    public static void staircase(int n) {
        // Write your code here
        for(int noOfSymbols=1; noOfSymbols <= n; noOfSymbols++){
            // System.out.println(noOfSymbols);
            //note that n = noOfSpaces + noOfSymbols
            int noOfSpaces = n - noOfSymbols;
            // System.out.println(noOfSpaces + " " + noOfSymbols);
            for(int i = 0; i < noOfSpaces; i++){
                System.out.print(' '); // print no of spaces
            }
            for(int i = 0; i < noOfSymbols; i++){
                System.out.print('#'); // print no of symbols
            }
            System.out.println("");
        }

    }
}
