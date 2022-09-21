package com.udemylearn.arraysListExample1;

public class StudentMarks {
    public static void main(String[] args) {

        String student1Name = "Alex";
        String student2Name = "Jenny";
        int[] student1Marks = {95,100,65,85,96,79,16,100};
        int[] student2Marks = {89,73,95,97,34,78,90};

        Student student1 = new Student(student1Name, student1Marks);
        Student student2 = new Student(student2Name, student2Marks);
//        int number1 = student1.getNumberOfMarks();
//        int sum1 = student1.getTotalSumOfMarks();
//        int maximumMark1 = student1.getMaximumMark();
//        int minimumMark1 = student1.getMinimumMark();
//        BigDecimal average1 = student1.getAverageMarks();

//        int number2 = student2.getNumberOfMarks();
//        int sum2 = student2.getTotalSumOfMarks();
//        int maximumMark2 = student2.getMaximumMark();
//        int minimumMark2 = student2.getMinimumMark();
//        BigDecimal average2 = student2.getAverageMarks();

        System.out.println(student1);
        System.out.println("______________________________________________________");
//        printStudentInfo(student1Name, number1, sum1, maximumMark1, minimumMark1, average1);


        student1.addNewMark(35);

        System.out.println(student1);

        System.out.println("______________________________________________________");
        System.out.println(student2);

        student2.removeMarkAtIndex(1);

        System.out.println(student2);
//        printStudentInfo(student2Name, number2, sum2, maximumMark2, minimumMark2, average2);

    }

//    private static void studentInfo(String studentName, int number, int sum, int maximumMark, int minimumMark, BigDecimal average) {
//        System.out.println(studentName + "'s Number Of Marks  = " + number);
//        System.out.println(studentName + "'s Total Sum Of Marks  = " + sum);
//        System.out.println(studentName + "'s Maximum Mark  = " + maximumMark);
//        System.out.println(studentName + "'s Minimum Mark  = " + minimumMark);
//        System.out.println(studentName + "'s Average Marks  = " + average);
//    }
//    private static void printStudentInfo(String studentName, int number, int sum, int maximumMark, int minimumMark, BigDecimal average) {
//        studentInfo(studentName, number, sum, maximumMark, minimumMark, average);
//    }
}
