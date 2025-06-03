package week3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int fac = 1;
        while(n>0){
            fac = fac*n;
            n--;

        }
        System.out.println("Factorial of the given number" +fac);

        sc.close();
    }
}
