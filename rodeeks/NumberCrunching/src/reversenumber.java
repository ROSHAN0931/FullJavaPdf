import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int rem,sum=0;
        int t=n;
        while (n>0)
        {
            rem=n%10;
            sum=sum*10 +rem;
            n=n/10;
        }
        System.out.println("reverse number is : " + sum);
        if(sum == t)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
