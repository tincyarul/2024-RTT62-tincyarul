package org.example.ArrayList;

public class ArrayListDelete {
    public static int[] delete (int[] source,int deletePosition,int valueToDelete)
    {
        int[] result=new int[source.length+1];
        for(int pos=0;pos<deletePosition ;pos++)
        {
            result[pos+1]=source[pos];
        }
        result[deletePosition]=9;
        for(int pos=deletePosition;pos<source.length;pos++)
        {
            result[pos+1]=source[pos];
        }
        for( int pos=valueToDelete;pos<source.length;pos++)
        {
            System.out.println(valueToDelete);
        }
        return result;
    }
    public static void main(String[] args) {

        int[] result = {1, 2, 3, 4, 5,8,9};
        int deleteposition=6;
        if(deleteposition<0 || deleteposition>result.length)
        {
            System.out.println("position is invalid");
        }
        int[] delete = new int[result.length - 1];
        for (int pos = 0; pos < deleteposition; pos++)
        {
            delete[pos] = result[pos];
        }
        for(int pos=deleteposition ;pos<result.length;pos++)
        {
            delete[pos-1]=result[pos];
        }
        for (int value : delete) {
            System.out.println(value);
        }
    }
}
