import java.util.*;
public class Factors {
    static ArrayList<Integer> factors = new ArrayList<Integer>();
    static Scanner userInput = new Scanner(System.in);
    public static void main(String args[]) {
        try {
            System.out.println("Enter an integer that you wish to find the integer factors of.");
            int userDividend = userInput.nextInt();
            System.out.println(calcFactors(userDividend));
        } catch (Exception e) {
            System.out.println("Something went wrong. Make sure you entered an integer.");
        }
    }

    public static ArrayList<Integer> calcFactors(int dividend) {
        /**returns ArrayList of factors least to greatest of a number*/
        for (int i = 1; i <= dividend; i++) {
            if (dividend % i==0) {
                factors.add(i);
            }
        }
        return factors;
    }
}