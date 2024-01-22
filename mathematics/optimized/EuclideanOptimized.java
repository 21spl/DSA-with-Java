package com.mathematics.optimized;

import java.util.Scanner;

public class EuclideanOptimized {
    //method to find GCD
    int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }

    // main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        EuclideanOptimized obj = new EuclideanOptimized();
        int result = obj.gcd(a,b);
        System.out.print("GCD of "+ a + " "+ b + "is: "+ result);
    }
}
