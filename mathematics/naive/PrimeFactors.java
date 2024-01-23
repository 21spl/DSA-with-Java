package com.mathematics.naive;
import java.util.*;
public class PrimeFactors {

    //check prime method
    boolean isPrime(int n)
    {
        boolean prime = true;
        for(int i = 2; i*i<n; i++)
        {
            if(n%i == 0)
            {
                prime = false;
                break;
            }
        }
        return prime;
    }

    //method to print prime factors
    void primeFactors(int n)
    {
        for(int i = 2; i<n; i++)
        {
            if(isPrime(i))
            {
                int x = i;
                while (n%x==0)
                {
                    System.out.print(x+" ");
                    x = x*i;
                }

            }
        }
    }

    //main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        //create object of class PrimeFactors
        PrimeFactors obj = new PrimeFactors();
        obj.primeFactors(n);
    }
}
