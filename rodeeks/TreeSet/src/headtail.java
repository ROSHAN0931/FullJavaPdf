import java.util.TreeSet;

public class headtail {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(20);
        set.add(3);
        set.add(45);
        set.add(13);
        set.add(32);
        System.out.println(set);//3 5 13 20 32 45
        TreeSet<Integer> headset = (TreeSet<Integer>) set.headSet(20);
        System.out.println("After headset" + headset);
        TreeSet<Integer> tailset = (TreeSet<Integer>) set.tailSet(5);
        System.out.println("After tailset" + tailset);
        TreeSet<Integer> subset = (TreeSet<Integer>) set.subSet(5,32);
        System.out.println("After subset" + subset);

    }
}
