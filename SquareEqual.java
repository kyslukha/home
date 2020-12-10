package com.alevel.homework1;

public class SquareEqual {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int c = 6;

        double D = b*b - (4*c*a);
        if (D<0) System.out.println("No solutions");
        else
        {
            if(D==0) System.out.println("Solution is " + (-b/(2*a)));
            else
            {
                System.out.println("Solution are");
                System.out.println((-b+ Math.sqrt(D))/(2*a));
                System.out.println((-b- Math.sqrt(D))/(2*a));
            }
        }


    }
}
