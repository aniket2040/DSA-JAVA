import java.util.Scanner;
public class Innerleapyear {
public static void main(String[] args) {
    int a;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter year");
    a= in.nextInt();
    if (a%4==0){
        System.out.println("Entered year is a leapyear");
    }else{
        System.out.println("Entered year is not a leapyear");
    }
    in.close();
}
}