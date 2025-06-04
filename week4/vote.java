package week4;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        System.out.println("enter the age");
        int Age = ak.nextInt();
        String check_Age = check(Age);
        System.out.println("result :" +check_Age);
        ak.close();
    }
    public static String check(int Age){
        if(Age!=0){
            if(Age>=18){
                return "eligible to vote";
            }
            else{
                return "Not Eligible to vote";
            }
        }
        else{
            return " Enter a valid age in wbhole number";
        }
    }
    
}
