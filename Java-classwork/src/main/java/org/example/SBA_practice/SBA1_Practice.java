package org.example.SBA_practice;

public class SBA1_Practice {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // part 1 - create a for loop to print each character of the string s on its own line
        // you can use the s.charAt(pos) function

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        /*
          A
          B
          C
          D
          E
          F
          G
          ...
         */

        // part 2
        // Given the following Strings convert them to integer values   Integer.valueOf()

        String ten = "10";
        String hundred = "100";
        int tenValue = Integer.valueOf(ten);
        int hundredValue = Integer.valueOf(hundred);

        System.out.println("Integer value of \"10\": " + tenValue);
        System.out.println("Integer value of \"100\": " + hundredValue);

        // part 3
        // given an integer array find the sum of all the integers in the array

        int[] array = {2, 4, 5, 6, 7, 8, 10};

        int sum = 0;
        for (int num : array)
        {
            sum += num;
        }

        System.out.println("Sum of all integers in the array: " + sum);

        // part 4
        // given the array of string covert them to numbers and print the sum

        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        int sum1 = 0;
        for (String num : nums) {
            sum1 += Integer.parseInt(num);
        }

        System.out.println("Print the sum : " + sum1);

    }

}
