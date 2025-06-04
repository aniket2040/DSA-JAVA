package week4;

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        System.out.println("enter the radius");
        double r = ak.nextDouble();
        double Area = Area(r);
        double circumference = circumference(Area);
        System.out.println("circle area :" +Area);
        System.out.println("Circle circumference :" +circumference);
        ak.close();
    }
    public static double Area(double r){
        double ar = (3.14*r*r);
        return ar;
    }
    public static double circumference(double r){
        double cir = (2*3.14*r);
        return cir;
    }
}
