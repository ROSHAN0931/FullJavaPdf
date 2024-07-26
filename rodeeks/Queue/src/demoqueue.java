import java.util.*;

public class demoqueue {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<String>();
        System.out.println("Is Empty ? : " + q.isEmpty());
        q.add("nec");
        q.add("csi");
        q.add("ooty");
        q.add("cbe");
        System.out.println("Normal queue : " + q);//nec csi ooty cbe erode
        System.out.println(q.offer("erode")); //true
        System.out.println(q);
        System.out.println(q.peek());//nec-returns first element
        System.out.println(q.poll());
        System.out.println(q);
    }
}