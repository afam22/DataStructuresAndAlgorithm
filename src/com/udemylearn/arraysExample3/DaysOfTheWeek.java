package com.udemylearn.arraysExample3;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("most letters of the week : " + mostNoOfLetters(daysOfTheWeek));
        reversedDaysOfTheWeek(daysOfTheWeek);
    }

    public static String mostNoOfLetters(String[] array){
        String day = "";
        int noOfLetters = 0;
        for (String s : array) {
            if (s.length() > noOfLetters) {
                day = s;
                noOfLetters = s.length();
            }
        }
        return day;
    }

    public static void reversedDaysOfTheWeek(String[] array){
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
