package org.example.PA_303_2_3_OperatorsAndNumbers;
//Write a program that declares an integer variable, assigns a number, and uses a
//postfix increment operator to increase the value. Print the value before and after the
//increment operator.
public class Task5_PostfixIncrementExample {
    public static void main(String[] args) {
        // Declare an integer variable and assign a number
        int x = 5;

        // Print the value before the increment operator
        System.out.println("Value before increment: " + x);

        // Use the postfix increment operator to increase the value
        x++;

        // Print the value after the increment operator
        System.out.println("Value after increment: " + x);
    }
}