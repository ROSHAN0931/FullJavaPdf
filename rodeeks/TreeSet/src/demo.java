import java.util.Iterator;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("praveen");
        set.add("monish");
        set.add("abishek");
        set.add("vinu");
        set.add("rodeeks");
        System.out.println("Normal Set " +set);
        System.out.println("Descending order " + set.descendingSet());
    }
}