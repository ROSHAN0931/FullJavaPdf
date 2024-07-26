import java.util.HashSet;

public class removefromanotherset {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Red");
        set1.add("Blue");
        set1.add("Yellow");
        set1.add("Green");
        System.out.println("Elements in set 1 " + set1);

        HashSet<String> set2 = new HashSet<String>();
        set2.add("Blue");
        set2.add("Green");
        System.out.println("Elements in set 2 " + set2);
        set1.removeAll(set2);
        System.out.println("After removing the elements " + set1);
    }
}
