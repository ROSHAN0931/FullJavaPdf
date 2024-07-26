import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public class evenoddcount {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter target ");
        int target =in.nextInt();
        int n = in.nextInt();
        while (n!=-1)
        {
            s1.push(n);
            n=in.nextInt();

        }
        if (s1.pop()==target)
        {
            System.out.println("fn");
        }
        else
        {
            System.out.println(s1);
        }

        System.out.println(s1);

//        System.out.println(s1);

    }
}
