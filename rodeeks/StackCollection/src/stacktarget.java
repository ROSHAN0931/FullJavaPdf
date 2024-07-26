import java.util.Scanner;
import java.util.Stack;

public class stacktarget {
    public static void main(String[] args) {
        Stack<Integer> si=new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter target");
        int t= in.nextInt();
        int n = in.nextInt();
        System.out.println("Stack ");
        while (n>0)
        {
            si.push(n);
            System.out.println(si);
            if(n==t)
            {
                si.pop();
            }
            n=in.nextInt();
        }
        System.out.println(si);
    }
}
