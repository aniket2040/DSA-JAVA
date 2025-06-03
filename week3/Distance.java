package week3;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the point A position ");
        double pointA = sc.nextDouble();
        System.out.println("Enter the point B position ");
        double pointB = sc.nextDouble();
        double distance = Math.abs(pointB - pointA);
        System.out.println("The distance between A and B is: " + distance);
        sc.close();
    }
    
}
