package com.busyqa.coursework.wk1_answer;

public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // The lowerbound to sum
        int upperbound = 100; // The upperbound to sum
        int count = 0;		  //count the number of occurrences
        // Use a for-loop to sum from lowerbound to upperbound
        
        for(int num=lowerbound; num <= upperbound;num++)
        {
        	sum += num;
        	count ++;
        }
        
        average = sum / count;
        
        //System.out.println("The sum is "+sum);
        //System.out.println("The average is "+average);
        System.out.printf("The sum is %d and Average is %.2f",sum,average);
    }
}
