package week3;

import java.util.Scanner;

public class compund_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double rateOfInterest = sc.nextDouble();
        System.out.println("Enter the time period in years");
        double time = sc.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = sc.nextInt();
        double comp_int = principal * Math.pow((1 + rateOfInterest / 100), (time*n) ) - principal;
        System.out.printf("The compound interest is: %.2f%n", comp_int);
        sc.close();
    }
    
}
