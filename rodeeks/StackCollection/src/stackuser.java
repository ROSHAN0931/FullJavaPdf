import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class stackuser
{
    public static void main(String[] args) {
        Stack<Character> c = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String s1= in.nextLine();
        for(char i : s1.toCharArray())
        {
            c.add(i);
        }

        Iterator i = c.iterator();
        while (!c.empty())
        {
            System.out.print(c.pop());
        }
        System.out.println(c);

    }
}
