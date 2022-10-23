package com.udemylearn.hackerRank.algorithms.basicChallenges;

/*
Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

In the diagram below:

The red region denotes the house, where s is the start point, and t is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.
Assume the trees are located on a single point a, where the apple tree is at point b, and the orange tree is at point .
When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. *A negative value of d means the fruit fell d units to the tree's left, and a positive value of d means it falls d units to the tree's right. *
 */
import java.util.ArrayList;
import java.util.List;

public class _001_appleOrangeCount {
    public static void main(String[] args) {
        int start_s = 7;
        int end_t = 11;
        int apple_a = 5;
        int sum_a = 0;
        int orange_b = 15;
        int sum_b = 0;
        int appleCount = 0;
        int orangeCount = 0;
        List <Integer> apples = apples();
        List <Integer> oranges = oranges();
        int noOfApples_m = apples.size();
        int noOfOranges_n = oranges.size();

        for (int i=0; i < noOfApples_m; i++){
            sum_a = apple_a + apples.get(i);
            if (sum_a >= start_s && sum_a <= end_t){
                appleCount++;
            }
        };

        for (int i=0; i < noOfOranges_n; i++){
            sum_b = orange_b + oranges.get(i);
            if (sum_b >= start_s && sum_b <= end_t){
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

    private static List<Integer> apples() {
        List<Integer> arr = new ArrayList<>();
        arr.add(-2);
        arr.add(2);
        arr.add(1);
        return arr;
    }

    private static List<Integer> oranges() {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(-6);
        return arr;
    }
}
