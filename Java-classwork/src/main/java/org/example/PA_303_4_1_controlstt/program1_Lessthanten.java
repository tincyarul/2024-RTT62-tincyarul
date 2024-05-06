package org.example.PA_303_4_1_controlstt;
//Write a program that declares 1 integer variable x, and then
//assigns 7 to it. Write an if statement to print out “Less than 10” if x is
//less than 10. Change x to equal 15, and notice the result (console
//should not display anything).

public class program1_Lessthanten {
    public static void main(String[] args) {
        int x = 7; // Declare and initialize integer variable x with value 7

        // Check if x is less than 10
        if (x < 10) {
            System.out.println("Less than 10");
        }

        // Change the value of x to 15
        x = 15;

        // Since x is now 15, the condition x < 10 is false, so nothing will be printed
    }
}
