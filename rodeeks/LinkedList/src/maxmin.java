import java.text.CollationElementIterator;
import java.util.*;
class maxmin
{
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        int val=in.nextInt();//red
        while(val!=0)
        {
            l1.add(val);
            val=in.nextInt();
        }
        int max=Collections.max(l1);
        int min=Collections.min(l1);
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
    }
}
