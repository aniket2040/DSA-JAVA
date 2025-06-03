package week3;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        int num , largest=Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter a number: ");
            num = ak.nextInt();
            if(num == 0){
                break;
            }
            if(num > largest){
                largest = num;
            }
        }
        if(largest==Integer.MIN_VALUE){
            System.out.println("no number is enterned ");
        }
        else{
            System.out.println("Largest number is: "+largest);
        }
        ak.close();
    }
    
}
