// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

// Example 1:

// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15
// Example 2:

// Input: n = 4421
// Output: 21
// Explanation: 
// Product of digits = 4 * 4 * 2 * 1 = 32 
// Sum of digits = 4 + 4 + 2 + 1 = 11 
// Result = 32 - 11 = 21

package week3;

import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        int n = ak.nextInt();
        int product=1 , sum=0;
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            product *= digit;  // Multiply the digit to the product
            sum += digit;      // Add the digit to the sum
            n /= 10;
        }
    System.out.println(product - sum);
    ak.close();
}
}
