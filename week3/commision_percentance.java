package week3;

import java.util.Scanner;

public class commision_percentance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double salesAmount = sc.nextDouble();
        System.out.println("Eneter the commision rate ");
        double commissionRate = sc.nextDouble(); // Example commission rate of 10%
        double commission = salesAmount * (commissionRate / 100);
        System.out.println("The commission is: " + commission);

        sc.close();
    }
    
}
