package org.example.PA_303_2_3_OperatorsAndNumbers;
//Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
//Write a comment that indicates what you predict will be the result of the bitwise and
//operation on x and y. Now use the bitwise AND (&) operator to derive the decimal and
//binary values, and assign the result to z

public class Task3_BitwiseAndExample {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;

        // Predicted result of bitwise AND operation on x and y: 1
        // x:   00000111
        // y:   00010001
        // z:   00000001 (decimal: 1)
        int z = x & y;

        System.out.println("Decimal: " + z);
        System.out.println("Binary: " + Integer.toBinaryString(z));
    }
}
