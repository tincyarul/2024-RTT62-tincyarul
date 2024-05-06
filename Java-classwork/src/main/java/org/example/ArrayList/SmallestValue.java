package org.example.ArrayList;

public class SmallestValue {
    public static void main(String[] args) {
int[] myarray={0,2,4,6,8,10};
int minval=myarray[0];
for(int i =0;i<myarray.length;i++)
{
    int value= myarray[i];
    if(value<minval)
    {
        minval=myarray[i];
    }
}
        System.out.println(+minval);
    }
}
