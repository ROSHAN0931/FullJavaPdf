import java.util.Scanner;
import java.util.Stack;

public class balancingparanthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(bp(s));
    }
    public static boolean bp (String s)
    {
        Stack<Character> c = new Stack<Character>();
        for (char i : s.toCharArray()) {
        switch (i) {
            case '(': case '{': case '[':
                c.push(i);
                    break;
            case ')':
                if (c.empty() || c.pop() != '(') {
                    return false;
                }
                break;
            case ']':
                if (c.empty() || c.pop() != '[') {
                    return false;
                }
                break;
            case '}':
                if (c.empty() || c.pop() != '{') {
                    return false;
                }
                break;
                }
        }
        return c.empty();
    }
}
