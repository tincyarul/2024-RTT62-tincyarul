package org.example.PA_303_4_1_controlstt;

//Write a program that declares 1 integer variable x, and then
//assigns 7 to it. Write an if-else statement that prints out “Less than 10”
//if x is less than 10, and “Greater than 10” if x is greater than 10.
//Change x to 15 and notice the result.

public class program2_Lessthanten {
    public static void main(String[] args) {
        int x = 7; // Declare and initialize integer variable x with value 7

        // Check if x is less than 10
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }

        // Change the value of x to 15
        x = 15;

        // Now, x is greater than 10, so "Greater than 10" will be printed
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }
}
