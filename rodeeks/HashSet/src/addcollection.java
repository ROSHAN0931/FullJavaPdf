import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class addcollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);;
        list.add(3);
        System.out.println("List " + list);

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("LinkedHash " + set);

        set.addAll(list);

        System.out.println("Ater adding list to set " + set);
    }
}
