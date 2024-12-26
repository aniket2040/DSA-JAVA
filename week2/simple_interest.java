package week2;
import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        System.out.println("Enter the principal ammount :");
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest :");
        double rate = sc.nextDouble();
        System.out.println("Enter the time in years :");
        double time = sc.nextDouble();
        double simple_interest = (principal * rate * time) / 100;
        System.out.println("Simple interest is : " + simple_interest);
        sc.close();
    }
    
}
