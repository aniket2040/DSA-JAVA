package week3;

import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float unit_cost = sc.nextInt();
        float Total_unit = sc.nextInt();
        float bill = unit_cost * Total_unit;
        System.out.println("Your electricity Bill" + bill);
        sc.close(); 
    }
    
    
}
