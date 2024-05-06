package org.example.PA_303_4_1_controlstt;
//. Write a program that uses if-else-if statements to print out grades
//A, B, C, D, F, according to the following criteria:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: <60
//Use the Scanner class to accept a number score from the user to
//determine the letter grade. Print out “Score out of range” if the score
//is less than 0 or greater than 100

import java.util.Scanner;

public class program5_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a score
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        // Check if the score is out of range
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else {
            // Determine the letter grade based on the score
            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else if (score >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }

        scanner.close();
    }
}
