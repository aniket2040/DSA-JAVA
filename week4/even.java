package week4;


import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        System.out.println("enter the  number");
        int num = ak.nextInt();
        String check_num = check(num);
        System.out.println("result" +check_num);
        ak.close();
    }
    public static String check(int num){
        if(num!=0){
            if(Integer.toBinaryString(num).endsWith("0")){
                return "Even";
            }
            else{
                return "Odd";
            }

        }
        else{
            return "Zero";
        }
    }
}
