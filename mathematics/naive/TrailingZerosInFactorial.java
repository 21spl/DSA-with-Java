package mathematics.naive;

// java program to count trailing zeros in a factorial
import java.util.*;

public class TrailingZerosInFactorial {
    // method to count trailing zeros
    int countTrailingZeros(int n) {
        int zeroCount = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                zeroCount++;
            } else {
                break;
            }
            n = n / 10;
        }
        return zeroCount;
    }

    // method to find factorial
    int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // create object of Trailing Zeros
        TrailingZerosInFactorial t = new TrailingZerosInFactorial();
        int factorial = t.factorial(n);
        int result = t.countTrailingZeros(factorial);
        System.out.println(result);
    }
}