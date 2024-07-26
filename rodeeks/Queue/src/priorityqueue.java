import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("pq is empty ? : " + pq.isEmpty());
        pq.add(10);
        pq.add(20);
        pq.add(15);
        System.out.println("elements in pq " + pq);
        pq.offer(5);
        pq.offer(25);
        System.out.println("after offering :" + pq);
        System.out.println("peek : " + pq.peek());
        System.out.println("after polling : " + pq.poll());
        System.out.println("elements in pq " + pq);
        pq.remove(15);
        System.out.println("after removing : " + pq);
        System.out.println("is empty ? : " + pq.isEmpty());
        System.out.println("size of pq : " + pq.size());
        System.out.println(pq.contains(10));
        System.out.println(pq.contains(5));
        pq.add(10);
        pq.offer(20);
        System.out.println("elements in pq " + pq);
        //10 10 25 20 20
        HashSet<Integer> lh = new HashSet<>(pq);
        System.out.println("HashSet : " + lh);//25 20 10

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(pq);
        System.out.println("LinkedHashSet : " + lhs);//10 25 20

        TreeSet<Integer> ts = new TreeSet<>(lhs);
        System.out.println("TreeSet : " + ts);
    }
}
