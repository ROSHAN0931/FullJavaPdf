import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swapelements {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(6);
        l1.add(7);
        System.out.println(l1);
        Collections.swap(l1,1,4);
        System.out.println(l1);
    }
}
