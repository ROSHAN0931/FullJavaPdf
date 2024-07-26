import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        if (n>9){
            sum = (n % 9 == 0 )? 9 : n%9 ;
        }
        else {
            sum = n;
        }
        System.out.println("Sum is : " + sum);
    }
}
