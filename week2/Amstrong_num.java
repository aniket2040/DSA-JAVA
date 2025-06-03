package week2;
import java.util.Scanner;
public class Amstrong_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower number");
        int lower = sc.nextInt();
        System.out.println("Enter the upper number");
        int upper = sc.nextInt();
        System.out.println("Armstrong number between" +lower+"and"+upper+"are:");
        for(int i=lower;i<=upper;i++){
            if (isArmstrong(i)) {
                System.out.println(i);
                
            }
        }
        sc.close();
    
    }

public static boolean isArmstrong(int number){
    int original = number;
    int sum = 0;
    int digit = String.valueOf(number).length();
    while (number != 0) {
        int remainder = number % 10;
        sum = sum + (int) Math.pow(remainder, digit);
        number = number / 10;
        }
        return original == sum;
    }
}
