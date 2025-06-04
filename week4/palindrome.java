package week4;

public class palindrome {
    public class PalindromeChecker {
        // Method to check if a number is a palindrome
        public static boolean isPalindrome(int num) {
            int original = num;
            int reverse = 0;

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }

            return original == reverse;
        }

        public static void main(String[] args) {
            int number = 12321;
            System.out.println(number + " is palindrome? " + isPalindrome(number));
        }
        
        // public static boolean isPalindromeString(int num) {
        //     String str = Integer.toString(num);
        //     return str.equals(new StringBuilder(str).reverse().toString());
        // }
        
    }    
    
}
