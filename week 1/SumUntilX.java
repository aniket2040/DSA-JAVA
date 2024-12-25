import java.util.Scanner;
public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        while(true){
            System.out.println("Enter a number (or 'x' to stop): ");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("X")){
                break;
            }
            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
                // TODO: handle exception
            }
        }
        
        System.out.println("The sum of all entered numbers is: " + sum);
    }
    
}
