import java.util.*;

public class duplicatedeque {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        System.out.println("original : " + d);
        removeDuplicate(d);
        System.out.println("after removing : " + d);
    }
    public static <T> void removeDuplicate(Deque<T> d)
    {
        Set s = new HashSet<T>();
        Deque d1 = new ArrayDeque<T>();
        for (T i : d)
        {
            if (s.add(i))
            {
                d1.add(i);
            }
        }
        d.clear();
        d.addAll(d1);
    }



}
