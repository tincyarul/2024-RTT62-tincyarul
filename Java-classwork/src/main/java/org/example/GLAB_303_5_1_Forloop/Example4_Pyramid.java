package org.example.GLAB_303_5_1_Forloop;

public class Example4_Pyramid {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
