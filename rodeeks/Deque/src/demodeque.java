import java.util.*;

public class demodeque {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.addFirst(4);
        d.addLast(6);
        d.addFirst(5);
        d.addLast(7);
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
        d.remove();
        System.out.println(d);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        System.out.println(d.peek());
    }
}