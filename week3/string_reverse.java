package week3;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sting");
        String original = sc.nextLine();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);
        sc.close();

    }
    
}
