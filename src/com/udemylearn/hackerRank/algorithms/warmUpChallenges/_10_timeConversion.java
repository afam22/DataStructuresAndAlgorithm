package com.udemylearn.hackerRank.algorithms.warmUpChallenges;

/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example
Return '12:01:00'.
Return '00:01:00'.

Function Description
Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
string s: a time in  hour format
string: the time in  hour format
Input Format
A single string  that represents a time in -hour clock format (i.e.:  or ).

All input times are valid
Sample Input 0
07:05:45PM
Sample Output 0
19:05:45
 */
public class _10_timeConversion {
    public static void main(String[] args) {
        String s = "12:02:32PM";
        // convert to string array
        String [] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);

        String last = parts[parts.length - 1];
        System.out.println(s);
        int sec = Integer.parseInt(last.substring(0,(last.length()/2)));
        String amPM = last.substring(((last.length()/2)),last.length());

        String newFormat = "";
        if(amPM.compareTo("PM") == 0){
            newFormat = String.format("%02d:%02d:%02d", (hour + 12), min, sec);
            if (hour == 12){
                newFormat = String.format("%02d:%02d:%02d", (hour), min, sec);
            }
        }
        if(amPM.compareTo("AM") == 0){
            newFormat = String.format("%02d:%02d:%02d", (hour), min, sec);
            if (hour == 12){
                newFormat = String.format("%02d:%02d:%02d", (hour - 12), min, sec);
            }
        }
        System.out.println(newFormat);
    }
}
