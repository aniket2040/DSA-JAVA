package week3;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subject = sc.nextInt();
        double total = 0;
        System.out.print("Enter marks for subject : ");
        for (int i = 0; i < subject; i++) {
            int marks = sc.nextInt();
            // Process marks (e.g., add to total or calculate CGPA)
            // Add marks to total
             total += marks;

        }
        double Average = total / subject;
        System.out.println("Average Marks: " + Average);
        double cgpa = total / subject;
        System.out.println("CGPA: " + cgpa);
        

        sc.close();
    }
    
}
