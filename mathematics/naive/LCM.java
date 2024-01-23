package com.mathematics.naive;
import java.lang.*;
import java.util.Scanner;

public class LCM {

    //method to find lcm
    int lcm(int a, int b)
    {
       int  result = Math.max(a,b);
        while(true)
        {
            if(result % a == 0 && result % b == 0)
                return result;
            result++;
        }
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
