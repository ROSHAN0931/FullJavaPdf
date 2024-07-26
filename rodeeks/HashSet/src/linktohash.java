import java.util.*;

public class linktohash {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("roshan");
        ll.add("csi");
        ll.add("nec");
        ll.add("erode");
        ll.add("csi");
        System.out.println("Linkedlist elements ");
        System.out.println(ll);
        HashSet<String> hs = new HashSet<String>(ll);
        System.out.println(hs);
    }
}
