package org.example.PA_303_2_3_OperatorsAndNumbers;
//Write a program that demonstrates at least three ways to increment a variable by 1
//and does this multiple times. Assign a value to an integer variable, print it, increment
//by 1, print it again, increment by 1, and then print it again.

public class Task6_IncrementExample1 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Initial value: " + x);
        x++;
        System.out.println("After incrementing using ++: " + x);
        x++;
        System.out.println("After incrementing using ++ again: " + x);
        int y = 5;
        System.out.println("\nInitial value: " + y);
        y = y + 1;
        System.out.println("After incrementing using +: " + y);
        y = y + 1;
        System.out.println("After incrementing using + again: " + y);

        // Method 3: Using compound assignment operator (+=)
        int z = 5;
        System.out.println("\nInitial value: " + z);
        z += 1;
        System.out.println("After incrementing using +=: " + z);
        z += 1;
        System.out.println("After incrementing using += again: " + z);
    }
}
