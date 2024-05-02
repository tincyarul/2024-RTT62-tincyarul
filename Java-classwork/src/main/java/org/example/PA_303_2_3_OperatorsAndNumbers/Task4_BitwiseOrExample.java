package org.example.PA_303_2_3_OperatorsAndNumbers;
//4. Now, with the preceding values, use the bitwise and operator to calculate the “or”
//value between x and y. As before, write a comment that indicates what you predict
//the values to be before printing them out.

public class Task4_BitwiseOrExample {
    public static void main(String[] args) {
        // Given values
        int x = 5;
        int y = 8;

        // Predicted result of bitwise OR operation on x and y: 13
        // x:   00000101
        // y:   00001000
        // OR:  00001101 (decimal: 13)
        int result = x | y;

        System.out.println("Decimal: " + result);
        System.out.println("Binary: " + Integer.toBinaryString(result));
    }
}
