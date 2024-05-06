package org.example.ArrayList;

public class ArrayListDelete {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int deleteposition=2;
        if(deleteposition<0 || deleteposition>array.length)
        {
            System.out.println("position is invalid");
        }
        int[] delete = new int[array.length - 1];
        for (int pos = 0; pos < deleteposition; pos++)
        {
            delete[pos] = array[pos];
        }
        for(int pos=deleteposition ;pos<array.length;pos++)
        {
            delete[pos-1]=array[pos];
        }
        for (int value : delete) {
            System.out.println(value);
        }
    }
}
