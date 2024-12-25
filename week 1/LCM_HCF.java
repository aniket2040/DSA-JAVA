import java.util.Scanner;
public class LCM_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First no.");
        int a = sc.nextInt();
        System.out.println("Enter Second no.");
        int b = sc.nextInt();
        int hcf = HCF(a, b);
        int lcm = LCM(a, b, hcf);
        System.out.println("HCF of " + a + " and " + b + " is" +hcf);
        System.out.println("LCM of " + a + "and"+b+"is"+lcm);

    }
    public static int HCF(int a ,int b) {
        while (b != 0) { 
            int temp = b; 
            b = a % b; 
            a = temp; 
        } 
        return a;
    }
    public static int LCM(int a, int b, int hcf){
        return (a * b) / hcf;
    }
}
