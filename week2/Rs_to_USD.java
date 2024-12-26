package week2;
import java.util.Scanner;
public class Rs_to_USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in Rupees");
        double rupees = sc.nextDouble();
        double usd = rupees * 0.014;
        System.out.println("The amount in USD is " + usd);
    }    
    
}
