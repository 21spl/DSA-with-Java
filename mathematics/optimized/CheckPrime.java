package com.mathematics.optimized;

import java.util.Scanner;

public class CheckPrime {

    //method to check prime
    int checkPrime(int a){
        int prime = 1;
        for(int i = 2; i*i<a; i++)
        {
            if(a%i == 0)
            {
                prime = 0;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        //create object of CheckPrime class

        if(n==1)
            System.out.print("It is neither prime nor composite");
        else
        {   CheckPrime obj = new CheckPrime();
            int result = obj.checkPrime(n);
            if (result == 1)
                System.out.println(n + " is prime");
            else
                System.out.println(n + "is not prime");
        }

    }
}
