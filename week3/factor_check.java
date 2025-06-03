package week3 ;
import java.util.Scanner;

public class factor_check {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = ak.nextInt();
        int sum = 0;
        
        for(int i=1; i<=(num/2); i++){
            if(num%i==0){
                sum += i;
                 
            }
        }
        System.out.println("Sum of all the factor of the number" +sum);


        ak.close();
    }
    
}
