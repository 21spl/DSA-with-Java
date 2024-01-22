package com.mathematics.optimized;
import java.util.*;

// using Euclidean Algorithm

// if b is smaller than 'a', then gcd(a,b) = gcd(a-b, b)

public class GCD {
    //method to find GCD
    int gcd(int a, int b)
    {
        while(a!=b)
        {
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        //return any of them
        return a;
    }
    //main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        GCD obj = new GCD();
        int result = obj.gcd(a,b);
        System.out.print("GCD of "+ a + " "+ b + "is: "+ result);
    }
}
