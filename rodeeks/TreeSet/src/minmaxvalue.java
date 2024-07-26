import java.util.TreeSet;

public class minmaxvalue {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(20);
        set.add(3);
        set.add(45);
        System.out.println("Set are " + set);
        System.out.println("Minimum is " + set.first());
        System.out.println("Maximum is " + set.last());
    }
}
