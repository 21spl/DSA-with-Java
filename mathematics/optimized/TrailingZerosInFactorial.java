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
