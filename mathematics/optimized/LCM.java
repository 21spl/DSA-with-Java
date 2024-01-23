package com.mathematics.optimized;

import java.util.Scanner;

// a * b = gcd(a,b) * lcm(a,b)
public class LCM {

    //method to find gcd
    int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }

    //method to find LCM
    int lcm(int a, int b)
    {
        return (a*b)/gcd(a,b);
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

        //create object of LCM class
       LCM obj = new LCM();
        int result = obj.lcm(a,b);
        System.out.println("LCM of "+a+ " and "+ b +" is "+ result);
    }

}
