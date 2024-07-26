import java.util.ArrayList;
import java.util.TreeSet;

public class treetoarrlist {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(5);
        set.add(20);
        set.add(3);
        set.add(45);
        System.out.println("Values in set " + set);

        ArrayList<Integer> al = new ArrayList<Integer>(set);
        Integer index = al.indexOf(20);
        System.out.println("Index of 20 is : " + index);
    }
}
