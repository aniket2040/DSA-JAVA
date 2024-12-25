import java.util.Scanner;
public class multiplication_table 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int n = 1; n<=10; n++) {
           int mult = a*n  ;
           System.out.println(a + " * " + n + " = " + mult);
        }
        sc.close();
    }
}
