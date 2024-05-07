package org.example.PA_303_7_1_Arrays;
//Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the
//array.

//MixedArrayExample

public class Task10Array {
    public static void main(String[] args) {
        // Create an array that includes an integer, 3 strings, and 1 double
        Object[] mixedArray = {10, "hello", "world", "Java", 3.14};

        // Print the array
        System.out.println("Mixed array:");
        for (Object element : mixedArray) {
            System.out.println(element);
        }
    }
}
