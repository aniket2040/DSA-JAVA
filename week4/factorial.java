package week4;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static BigInteger Factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Factorial of " + num + " is: " + Factorial(num));

        scanner.close();
    }
    
}
