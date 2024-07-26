import java.util.ArrayDeque;
import java.util.Deque;

public class reversedeque {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<Integer>();
        d.addLast(10);
        d.addLast(20);
        d.addLast(30);
        d.addLast(40);
        System.out.println("elements are : " + d);

        Deque<Integer> r = new ArrayDeque<Integer>();
        while (!d.isEmpty())
        {
            r.add(d.pollLast());
        }

        System.out.println("reversed deque " + r);
    }
}
