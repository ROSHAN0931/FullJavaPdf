import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class replaceorange
{
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<String>();
        Scanner in = new Scanner(System.in);
        String val=in.nextLine();
        while(!val.equals("exit"))
        {
            l1.add(val);
            val=in.nextLine();
        }
        ListIterator<String> li= l1.listIterator();
        while (li.hasNext())
        {
            if(li.next().equals("apple"))
            {
                li.set("orange");
            }
        }
        System.out.println(l1);
    }
}
