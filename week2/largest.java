package week2;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of: ");
        int n = sc.nextInt();
        System.out.println("enter secomd number ");
        int num = sc.nextInt();
        if (n>num) {
            System.out.println("largest number is " + n);
            
        }else{
            System.out.println("largest number is " + num);
        }

    
}}
