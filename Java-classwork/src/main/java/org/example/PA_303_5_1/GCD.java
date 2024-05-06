package org.example.PA_303_5_1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two positive integers
        System.out.print("Enter the first positive integer: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        int n2 = scanner.nextInt();

        // Find the greatest common divisor
        int gcd = findGCD(n1, n2);

        // Display the result
        System.out.println("The gcd of " + n1 + " and " + n2 + " is " + gcd);

        scanner.close();
    }

    // Method to find the greatest common divisor using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
