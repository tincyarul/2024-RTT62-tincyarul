package org.example.ArrayList;

public class ArrayListDelete {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] delete = new int[array.length - 1];
        for (int pos = 0; pos < 4; pos++) {
            delete[pos] = array[pos];
        }

        for (int value : delete) {
            System.out.println(value);
        }
    }
}
