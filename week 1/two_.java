import java.util.Scanner;
public class two_{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int n = sc.nextInt();
        System.out.println("Enter second no.");
        int m = sc.nextInt();
        int sum = n + m;
        System.out.println("Sum of two numbers is " + sum);
        sc.close();
        
    }
}