import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input");
        int n = in.nextInt();

        int a=0;
        int b=1;
        System.out.print(a + " , " + b + " , ");

        int fib=0;
        for (int i = 2; i < n; i++) {
            fib = a + b;
            a = b;
            b = fib;
            if (i == n-1) {
                System.out.print(fib + " . ");
            } else {
                System.out.print(fib + " , ");
            }
        }
    }
}
