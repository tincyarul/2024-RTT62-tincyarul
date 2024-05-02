package org.example;

import java.text.DecimalFormat;

public class Homework_303_2_1 {


    public static void main(String[] args) {

        //Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result. in java language
        int firstNumber = 10;
        int secondNumber = 20;
        int sum = firstNumber + secondNumber;
        System.out.println("\nProgram: 1 \nThe sum of " + firstNumber + " and " + secondNumber + " is: " + sum);


        //Write a program that declares two double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        double double_firstNumber = 3.5;
        double double_secondNumber = 4.7;
        double result = double_firstNumber + double_secondNumber;
        System.out.println("\nProgram: 2 \nThe sum of " + firstNumber + " and " + secondNumber + " is: " + result);


        //Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?
        int intValue = 10;
        double doubleValue = 4.5;
        double intDoubleSum = intValue + doubleValue;
        System.out.println("\nProgram: 3 \nThe sum of " + intValue + " and " + doubleValue + " is: " + intDoubleSum);


        //Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable.Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
        int num44 = 10;
        int num45 = 5;
        int result4 = num44 > num45 ? num44 / num45 : num45 / num44;
        System.out.println("The result of dividing the larger number by the smaller number is: " + result4);
        num44 = 10;
        num45 = 5;
        double decimalNum41 = 10.0; // Change num1 to a decimal
        double resultDecimal4 = decimalNum41 > num45 ? decimalNum41 / num45 : num45 / decimalNum41;
        System.out.println("\nProgram: 4 \nThe result of dividing the larger decimal by the smaller number is: " + resultDecimal4);


        //Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
        // Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
        double num1 = 7.5;
        double num2 = 3.5;
        double result6 = num1 > num2 ? num1 / num2 : num2 / num1;
        System.out.println("The result of dividing the larger number by the smaller number is: " + result6);
        int resultInt = (int) result;
        System.out.println("\nProgram: 5 \nThe result cast to an integer is: " + resultInt);


        // Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("Value of q (integer division): " + q);
        q = (double) y;
        System.out.println("\nProgram: 6 \nValue of q (after casting y to double): " + q);


        //Write a program that declares a named constant and uses it in a calculation. Print the result.
        final double PI = 3.14159;
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("\nProgram: 7 \nThe area of the circle with radius " + radius + " is: " + area);


        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product.
        // Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product, and two items of the third product.
        // Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places
        String product1 = "Coffee";
        double price1 = 2.50;

        String product2 = "Cappuccino";
        double price2 = 3.00;

        String product3 = "Espresso";
        double price3 = 2.00;

        int quantity1 = 3;
        int quantity2 = 4;
        int quantity3 = 2;

        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        final double SALES_TAX = 0.08;
        double totalSale = subtotal * (1 + SALES_TAX);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\nProgram: 8 \nProduct\t\tPrice\t\tQuantity\tTotal");
        System.out.println("----------------------------------------------");
        System.out.println(product1 + "\t\t$" + price1 + "\t\t" + quantity1 + "\t\t$" + df.format(price1 * quantity1));
        System.out.println(product2 + "\t$" + price2 + "\t\t" + quantity2 + "\t\t$" + df.format(price2 * quantity2));
        System.out.println(product3 + "\t\t$" + price3 + "\t\t" + quantity3 + "\t\t$" + df.format(price3 * quantity3));
        System.out.println("----------------------------------------------");
        System.out.println("Subtotal:\t\t\t\t\t$" + df.format(subtotal));
        System.out.println("Sales Tax:\t\t\t\t\t$" + df.format(subtotal * SALES_TAX));
        System.out.println("Total Sale:\t\t\t\t\t$" + df.format(totalSale));
    }
}