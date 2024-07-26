import java.util.Iterator;
import java.util.Vector;

public class example1 {
    public static void main(String[] args) {
        Vector<String> v= new Vector<String>();
        v.add("ooty");
        v.add("roshan");
        v.add("csi");
        v.add("rodeeks");
        System.out.println("Normal" + v);
        System.out.println("-- - - - - - - --");
        System.out.println("Iterator");
        Iterator i = v.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("-- - - - - - - --");
        System.out.println("for each");
        for(String s : v)
        {
            System.out.println(s);
        }
        System.out.println("-- - - - - - - --");
        System.out.println("for loop");
        for (int j = 0; j < v.size(); j++) {
            System.out.println(v);
        }
    }
}