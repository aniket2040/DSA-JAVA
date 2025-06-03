package week3;

import java.util.Scanner;

public class depriciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Asset cost : ");
        double assetCost = sc.nextDouble();
        System.out.println("enter the Depreciation rate (in %): ");
        double depreciationRate = sc.nextDouble();
        double depreciationValue = assetCost * (depreciationRate / 100);
        System.out.println("the depriciated value :" +depreciationValue);
        sc.close();
    }
    
}
