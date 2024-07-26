import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input : ");
        int val = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= val; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + val + " is : " + fact);
    }
}