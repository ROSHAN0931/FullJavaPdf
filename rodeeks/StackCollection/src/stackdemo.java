import java.util.Stack;
import java.util.*;
public class stackdemo {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<Integer>();
        System.out.println("Empty or Not : " + s1.empty());
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println("Size of stack " + s1.size());
        System.out.println("Values in stack " + s1);
        s1.pop();
        System.out.println("After popping " + s1);
        System.out.println("Peeked element " +s1.peek());
        System.out.println("Search for number 2 position : " + s1.search(2));
        System.out.println("Empty or Not : " + s1.isEmpty());
        s1.clear();
        System.out.println("After clearing stack " + s1);
        try {
            System.out.println(s1.peek());
        }
        catch (EmptyStackException e){}

    }
}
