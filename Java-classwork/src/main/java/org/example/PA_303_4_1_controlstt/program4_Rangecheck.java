package org.example.PA_303_4_1_controlstt;
//Write a program that declares 1 integer variable x, and then
//assigns 15 to it. Write an if-else statement that prints “Out of range” if
//the number is less than 10 or greater than 20 and prints “In range” if
//the number is between 10 and 20 (including equal to 10 or 20).
//Change x to 5 and notice the result

public class program4_Rangecheck {
    public static void main(String[] args) {
        int x = 15; // Declare and initialize integer variable x with value 15

        // Check if x is in range or out of range using if-else statement
        if (x >= 10 && x <= 20) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

        // Change the value of x to 5
        x = 5;

        // Now, x is out of range, so "Out of range" will be printed
        if (x >= 10 && x <= 20) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
