package week3;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Enter the power");
        float p = sc.nextFloat();
        double result = Math.pow(number, p);
        System.out.printf("the result of " + number + " raised to the power of " + p + " is: "+result);
        sc.close();
    }
    

    
}
