package week3 ;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the numbers and press 0 to finish input.");
    double sum = 0;
    int count = 0;
    int number;
    while ((number = sc.nextInt()) != 0) {
        sum += number;
        count++;
    }
    double average = (count > 0) ? sum / count : 0;
    System.out.println("Average: " + average);
    sc.close();
    }
    
}
