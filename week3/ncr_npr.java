package week3;

public class ncr_npr {
    public static void main(String[] args) {
        System.out.println("Total object");
        int n = 5; // Total objects
        System.out.println("Objects to choose or arrange");
        int r = 2; // Objects to choose or arrange

        long ncr = factorial(n) / (factorial(r) * factorial(n - r));
        long npr = factorial(n) / factorial(n - r);

        System.out.println("NCR (Combination): " + ncr);
        System.out.println("NPR (Permutation): " + npr);

    }
    public static long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= num; i++){
            result += i;

        }
        return result;
    }
}
