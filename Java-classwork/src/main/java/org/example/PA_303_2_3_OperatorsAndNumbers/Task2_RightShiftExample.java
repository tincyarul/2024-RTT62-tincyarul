package org.example.PA_303_2_3_OperatorsAndNumbers;

//
public class Task2_RightShiftExample {
        public static void main(String[] args) {
            // a. For 225:
            int x = 225;
            // Anticipated decimal value after right shift by 2: 56
            // Anticipated binary value after right shift by 2: 111000
            x = x >> 2;
            System.out.println("Decimal: " + x);
            System.out.println("Binary: " + Integer.toBinaryString(x));

            // b. For 1555:
            x = 1555;
            // Anticipated decimal value after right shift by 2: 388
            // Anticipated binary value after right shift by 2: 110000100
            x = x >> 2;
            System.out.println("Decimal: " + x);
            System.out.println("Binary: " + Integer.toBinaryString(x));

            // c. For 32456:
            x = 32456;
            // Anticipated decimal value after right shift by 2: 8114
            // Anticipated binary value after right shift by 2: 1111110010010
            x = x >> 2;
            System.out.println("Decimal: " + x);
            System.out.println("Binary: " + Integer.toBinaryString(x));
        }
    }


