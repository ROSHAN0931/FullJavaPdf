import java.util.ArrayDeque;
import java.util.Deque;

public class dequerotate {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        System.out.println("Orginal deque : " + d);
        int n = 2;
        rotateright(d, n);
        System.out.println("After rotation : " + d);
    }
    public static <T> void rotateright(Deque<T> d, int n)
    {
        for (int i = 0; i < n; i++) {
            T last = d.removeLast();
            d.addFirst(last);
        }
    }
}
