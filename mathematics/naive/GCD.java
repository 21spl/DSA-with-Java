package com.mathematics.naive;
import java.lang.Math.*;
import java.util.Scanner;

public class GCD {
    // method to find gcd
    int gcd(int a, int b)
    {
        int res = Math.min(a,b);

        while (res>0)
        {
            if((a%res == 0) && (b%res == 0))
            {
                break;
            }
            res--;
        }
        return res;
    }
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
