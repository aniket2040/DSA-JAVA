package week3;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();
        double discountAmount = originalPrice * (discountPercentage / 100);
        double finalPrice = originalPrice - discountAmount;
        System.out.println("net Amount to be paid :" + finalPrice);

        sc.close();
    }
    
}
