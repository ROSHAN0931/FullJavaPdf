import java.util.ArrayDeque;
import java.util.Deque;

public class peekpoll {
    public static void main(String[] args) {
        Deque<String> d = new ArrayDeque<String>();
        d.offer("A");
        d.offerFirst("B");
        d.offer("C");
        System.out.println("after adding : " + d);

        System.out.println("peeking : " + d.peek());
        System.out.println("polled : " + d.poll());

        System.out.println("deque is : " + d);
    }
}
