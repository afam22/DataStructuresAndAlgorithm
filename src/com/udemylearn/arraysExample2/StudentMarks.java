package com.udemylearn.arraysExample2;

import java.math.BigDecimal;

public class StudentMarks {
    public static void main(String[] args) {

        String student1Name = "Alex";
        String student2Name = "Jenny";
        int[] student2Marks = {89,73,95,97,34,78,90};

        Student student1 = new Student(student1Name, listOfMarks());
        int number1 = student1.getNumberOfMarks(listOfMarks());
        int sum1 = student1.getTotalSumOfMarks(listOfMarks());
        int maximumMark1 = student1.getMaximumMark(listOfMarks());
        int minimumMark1 = student1.getMinimumMark(listOfMarks());
        BigDecimal average1 = student1.getAverageMarks(listOfMarks());

        Student student2 = new Student(student2Name, student2Marks);
        int number2 = student2.getNumberOfMarks(student2Marks);
        int sum2 = student2.getTotalSumOfMarks(student2Marks);
        int maximumMark2 = student2.getMaximumMark(student2Marks);
        int minimumMark2 = student2.getMinimumMark(student2Marks);
        BigDecimal average2 = student2.getAverageMarks(student2Marks);

        printStudentInfo(student1Name, number1, sum1, maximumMark1, minimumMark1, average1);
        System.out.println("______________________________________________________");
        printStudentInfo(student2Name, number2, sum2, maximumMark2, minimumMark2, average2);

      /*  int[] marks = {75,60,56};           // shortcut in declaring an array and inserting its values
        //typical way is stated below
        //int[] marks2 = new int[5];          //means marks2 has 5 values in it
        int totalMarks = calculateTotalSumOfMarks(marks);
        System.out.println("total marks = " + totalMarks);
       */
    }

    private static void printStudentInfo(String studentName, int number, int sum, int maximumMark, int minimumMark, BigDecimal average) {
        studentInfo(studentName, number, sum, maximumMark, minimumMark, average);
    }

    private static void studentInfo(String studentName, int number, int sum, int maximumMark, int minimumMark, BigDecimal average) {
        System.out.println(studentName + "'s Number Of Marks  = " + number);
        System.out.println(studentName + "'s Total Sum Of Marks  = " + sum);
        System.out.println(studentName + "'s Maximum Mark  = " + maximumMark);
        System.out.println(studentName + "'s Minimum Mark  = " + minimumMark);
        System.out.println(studentName + "'s Average Marks  = " + average);
    }

    private static int[] listOfMarks(){
        int[] intArray = new int[7];

        intArray[0] = 100;
        intArray[1] = 95;
        intArray[2] = 70;
        intArray[3] = 75;
        intArray[4] = 55;
        intArray[5] = 90;
        intArray[6] = 65;

        return intArray;
    }


    /*public static int calculateTotalSumOfMarks(int[] array){
        int sum = 0;
        //enhanced for loop
        for (int mark:array){
            sum = sum+mark;
        }
        return sum;
    }*/
}
