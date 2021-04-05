package com.busyqa.coursework.wk2_answer;

import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        int numInput = 0;
        int numStudent = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");

        numStudent = Integer.parseInt(in.next());   // use next() to read a String
        int[] arrStudent = new int[numStudent];


        do {
            System.out.print("\nEnter the grade for student " + (numInput + 1) + " :");
            int grade = Integer.parseInt(in.next());   // use next() to read a String

            //put the grade to array based on the index which is incremented by the loop
            if (grade >= 0 && grade <= 100) {
                arrStudent[numInput] = grade;
            } else {
                System.out.print("\nThis is not valid grade.");
                continue;
            }

            numInput++;
        } while (numInput < numStudent);

        //sumup the array by loop
        int sumup = 0;
        for (int index = 0; index < arrStudent.length; index++) {
        	sumup += arrStudent[index];
        }

        //print it out
        float average = sumup / (numInput);
        System.out.printf("The average is: %.2f",average);


    }
}
