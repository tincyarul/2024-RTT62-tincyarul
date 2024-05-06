package org.example.GLAB_303_5_1_Forloop;
// Program to find the sum of natural numbers from 1 to 1000.

public class Example2_Display_no {
            public static void main(String[] args) {
            int sum = 0;
            int n = 1000;

            for (int i = 1; i <= n; ++i) {

                sum += i; // sum = sum + i
            }
            System.out.println("Sum = " + sum);
        }
    }

