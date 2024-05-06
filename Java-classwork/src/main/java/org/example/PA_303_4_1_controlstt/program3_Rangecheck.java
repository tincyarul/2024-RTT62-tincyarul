package org.example.PA_303_4_1_controlstt;

public class program3_Rangecheck {
    public static void main(String[] args) {
        int x = 15; // Declare and initialize integer variable x with value 15

        // Check the value of x using if-else-if statements
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }

        // Change the value of x to 50
        x = 50;

        // Now, x is greater than or equal to 20, so "Greater than or equal to 20" will be printed
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
    }
}
