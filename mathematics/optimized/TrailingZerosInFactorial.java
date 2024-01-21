/*Approach
Count trailing zeroes by counting occurrence of 5 in the factorial:
A simple method is to first calculate factorial of n, then count trailing 0s in the result but this can cause overflow 
for bigger numbers. The idea is to consider prime factors of a factorial n. A trailing zero is always produced by prime 
factors 2 and 5. If we can count the number of 5s and 2s, our task is done.

Illustration:

Consider the following examples:

Input: n = 5: There is one 5 and three 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So a count of trailing 0s is 1.
Input: n = 11: There are two 5s and eight 2s in prime factors of 11! (2 8 * 34 * 52 * 7). So the count of trailing 0s is 2.

We can observe that the number of 2s in prime factors is always more than or equal to the number of 5s. So, if we count 5s 
in prime factors, we are done.

How to count the total number of 5s in prime factors of n! ?
A simple way is to calculate floor(n/5). For example, 7! has one 5, 10! has two 5s. But, numbers like 25, 125, etc have more 
than 5 instead of floor (n / 5). For example, if we consider 28! we get one extra 5 and the number of 0s becomes 6. Handling 
this is simple, first, divide n by 5 and remove all single 5s, then divide by 25 to remove extra 5s, and so on.

Following is the summarized formula for counting trailing 0s.

Trailing 0s in n! = Count of 5s in prime factors of n! = floor(n/5) + floor(n/25) + floor(n/125) + ….

Steps to solve the above problem:

Initialize a variable count = 0 to keep track of trailing zeros.
Iterate a loop over all the powers of 5 until the power exceeds n:
Divide n by the current power of 5 and add the quotient to count.
Return count as the final answer.
 */

package mathematics.optimized;

import java.util.*;

public class TrailingZerosInFactorial {
    // optimized method to find trailing Zeros in factorial
    int countTrailingZeros(int n) {
        int count = 0;
        int i;
        for (i = 5; i <= n; i = i * 5) {
            count = count + n / i;
        }
        return count;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // create object of the class
        TrailingZerosInFactorial t = new TrailingZerosInFactorial();
        int result = t.countTrailingZeros(n);
        System.out.print("Trailing zeros in factorial of " + n + " is " + result);
    }
}
