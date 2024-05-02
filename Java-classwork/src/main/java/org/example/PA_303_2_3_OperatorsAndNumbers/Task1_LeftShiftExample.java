package org.example.PA_303_2_3_OperatorsAndNumbers;

//Write a program that declares an integer a variable x, assigns the value 2 to it, and
//prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now,
//use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing
//the results, write a comment with the predicted decimal value and binary string. Now,
//print out x in decimal form and in binary notation.
//Perform the preceding exercise with the following values:
//a. 9
//b. 17
//c. 88

    public class Task1_LeftShiftExample {
        public static void main(String[] args) {
            // a. For 9:
            int x = 9;
            // Predicted decimal value after left shift by 1: 18 (10010 in binary)
            x = x << 1;
            System.out.println("Decimal: " + x);
            System.out.println("Binary: " + Integer.toBinaryString(x));

            // b. For 17:
            x = 17;
            // Predicted decimal value after left shift by 1: 34 (100010 in binary)
            x = x << 1;
            System.out.println("Decimal: " + x);
            System.out.println("Binary: " + Integer.toBinaryString(x));

            // c. For 88:
            x = 88;
            // Predicted decimal value after left shift by 1: 176 (10110000 in binary)
            x = x << 1;
            System.out.println("Decimal: " + x);
            System.out.println("Binary: " + Integer.toBinaryString(x));
        }
    }


