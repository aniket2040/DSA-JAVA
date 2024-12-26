package week2;
import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter sencond number: ");
        int num2 = sc.nextInt();
        double Sum = num1+num2;
        double difference = num1-num2;
        double product = num1*num2;
        float division = num1/num2;
        System.out.println("Sum of the given number :"+Sum);
        System.out.println("Multiplication of the given number :"+product);
        System.out.println("Division of the given number :"+division);
        System.out.println("Subtaraction of the given number :"+difference);

    }
}
