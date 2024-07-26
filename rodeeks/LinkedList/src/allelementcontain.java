import java.util.LinkedList;
import java.util.Scanner;

class allelementcontain
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
        LinkedList<String> l2=new LinkedList<String>();
        String v=in.nextLine();
        while(!v.equals("exit"))
        {
            l2.add(v);
            v=in.nextLine();
        }
        System.out.println(l1.containsAll(l2));
    }
}
