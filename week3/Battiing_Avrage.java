package week3;

import java.util.Scanner;

public class Battiing_Avrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total hits: ");
        int hits = sc.nextInt();
        System.out.print("Enter total at-bats: ");
        int atBats = sc.nextInt();
        double battingAverage = (double) hits / atBats;
        System.out.printf("Batting Average: %.3" +battingAverage);
        sc.close();
    }
    
}
