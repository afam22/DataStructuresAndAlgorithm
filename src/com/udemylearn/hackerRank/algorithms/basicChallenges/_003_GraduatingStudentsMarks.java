package com.udemylearn.hackerRank.algorithms.basicChallenges;

import java.util.ArrayList;
import java.util.List;

public class _003_GraduatingStudentsMarks {
    public static void main(String[] args) {
        List<Integer> result = gradingStudents(array());
        System.out.println(result);
    }
    private static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int afterRoundingUp = 0;
        int diff = 0;
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<grades.size();i++) { // 73 67 38 33
            if(grades.get(i)%10 > 5){
                diff = 10 - (grades.get(i)%10);  //_ 3 2 _
            }else diff = 5 - (grades.get(i)%10); //2 _ _ 2

            if (grades.get(i) < 38) {
                afterRoundingUp = grades.get(i);
            }
            else if(diff < 3) {
                afterRoundingUp = grades.get(i) + diff;
            }
            else {
                afterRoundingUp = grades.get(i);
            }

            result.add(afterRoundingUp);
        }
        return result;

    }
    private static List<Integer> array() {
        List<Integer> arr = new ArrayList<>();
        arr.add(27);
        arr.add(23);
        arr.add(65);
        arr.add(43);
        arr.add(0);
        arr.add(82);
        arr.add(0);
        return arr;
    }

}

/*
https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
Examples

 round to  (85 - 84 is less than 3)
 do not round (result is less than 40)
 do not round (60 - 57 is 3 or higher)
Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

Function Description

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

int grades[n]: the grades before rounding
Returns

int[n]: the grades after rounding as appropriate
Input Format

The first line contains a single integer, , the number of students.
Each line  of the  subsequent lines contains a single integer, .

Constraints
 */
