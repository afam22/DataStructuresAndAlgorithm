package com.udemylearn.arraysExample2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks(int[] marks){
        return marks.length;
    }

    public  int getTotalSumOfMarks(int[] marks){
        int sum = 0;
        for (int mark:marks){
            sum = sum + mark;
        }
        return sum;
    }

    public int getMaximumMark(int[] marks){
        int max = Integer.MIN_VALUE; // 2, 3, 1
        for (int mark:marks){
            if (mark > max){
                max = mark;
            }
        }
        return max;
    }

    public int getMinimumMark(int[] marks){
        int min = Integer.MAX_VALUE; // 2, 1, 3
        for (int mark:marks){
            if (mark < min){
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal getAverageMarks(int[] marks){
        int sum = getTotalSumOfMarks(marks);
        int marksNo = getNumberOfMarks(marks);
        return new BigDecimal(sum).divide(new BigDecimal(marksNo),2, RoundingMode.UP);
    }
}
