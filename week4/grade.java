package week4;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) 
    {
        int count, i;
        float totalMarks = 0, percentage;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
        scanner.close();
    
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
            
        System.out.println("Total MArks : " + totalMarks);
            // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
    
        switch ((int) percentage / 10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
                System.out.println("Grade : A");
                break;
            case 7:
                System.out.println("Grade : B+");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C+");
                break;
            case 4:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }
    }
}
