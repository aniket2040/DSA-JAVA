package week4;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        System.out.println("enter first nummber ");
        long num1 = ak.nextInt();
        System.out.println("enter the second number");
        long num2 = ak.nextInt();
        long sum = sum_(num1, num2);
        long product = product_(num1, num2);
        System.out.println("Sum of the entered number"+sum);
        System.out.println("Product of two number : " +product); 
        ak.close();

    }
    public static long sum_(long a, long b){
        long add = (a+b);
        return add;
    }
    public static long product_(long a, long b){
        long product = (a*b);
        return product;
    }
    
}
