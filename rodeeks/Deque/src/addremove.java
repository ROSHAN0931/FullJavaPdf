import java.util.ArrayDeque;
import java.util.Deque;

public class addremove {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<Integer>();
        d.add(1);
        d.add(2);
        d.addFirst(0);
        System.out.println("after adding " + d);

        d.remove();
        d.removeLast();
        System.out.println("after removing " + d);
    }
}
