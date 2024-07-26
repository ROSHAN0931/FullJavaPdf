import java.util.HashSet;
import java.util.Iterator;

public class demohash {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("d");
        set.add("g");
        set.add("c");
        set.add("e");
        System.out.println(set);//c d e g

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);// 1 2 3 4 5
        System.out.println(set1.add(6));// true
        System.out.println(set1);//1 2 3 4 5 6
//        set.addAll(set1);
        HashSet hs = new HashSet();
        hs.add(31);
        hs.add("rodeeks");
        hs.add(3);
        hs.add('c');
        hs.add(3.45);
        System.out.println(hs);
    }
}

