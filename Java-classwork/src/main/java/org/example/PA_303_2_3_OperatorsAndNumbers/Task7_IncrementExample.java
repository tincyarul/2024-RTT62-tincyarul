package org.example.PA_303_2_3_OperatorsAndNumbers;

//Write a program that declares two integer variables: x, and y, and then assigns 5 to x
// and 8 to y. Create another variable sum and assign the value of ++x added to y, and
// print the result. Notice the value of the sum (should be 14). Now change the
// increment operator to postfix (x++) and re-run the program. Notice what the value of
// the sum is. The first configuration incremented x, and then calculated the sum, while
// the second configuration calculated the sum, and then incremented x.

public class Task7_IncrementExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        // Pre-increment (++x) - Increment x first, then calculate the sum
        int sum = ++x + y;
        System.out.println("Sum with pre-increment: " + sum); // Output: 14

        // Reset x
        x = 5;

        // Post-increment (x++) - Calculate the sum first, then increment x
        sum = x++ + y;
        System.out.println("Sum with post-increment: " + sum); // Output: 13
    }
}

