import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter input : ");
        int n = in.nextInt();
        int start = 2;//9
        while (start*start <=n) {
            if (n % start == 0) {
                break;
            }
            System.out.println(start);
            start++;
        }

        System.out.println(start);//9
        if (start*start > n ) {
            System.out.println("prime");
        } else {
            System.out.println("not");
        }
    }
}
