package week4;


import java.util.Scanner;

public class small {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter first no :");
        int first = ak.nextInt();
        System.out.println("Enter second no :");
        int second = ak.nextInt();
        System.out.println("Enter third no :");
        int third = ak.nextInt();

        int large_number = largest(first, second, third);
        int smallest_number = smallest(first, second, third);

        System.out.println("smallet no : " +large_number);
        System.out.println("largest no :" +smallest_number);

        ak.close();

    }
    public static int largest(int first, int second , int third){
        int max = first;
        if(second > max){
            max = second;
        }
        if(third > max){
            max=third;
        }
        return max;

    }
    public static int smallest(int first, int second , int third ){
        int min = first;
        if (second<min){
            min = second;
        }
        if(third<min){
            min=third;
        }
        return min;
    }
}
