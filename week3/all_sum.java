package week3;
import java.util.Scanner;
public class all_sum {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        int num , sum=0;
        while(true){
            System.out.println("Enter a number");
            num = ak.nextInt();
            if (num==0){
                break;
            }
            if( num>0){
                sum = sum + num;
            }
            else {
                System.out.println("enter a positive number ");
            }
        }
        System.out.println("Sum of all the imput you provided" +sum);
        ak.close();
    }
    
}
