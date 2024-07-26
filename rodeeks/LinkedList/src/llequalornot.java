import java.util.LinkedList;
import java.util.Scanner;

class llequalornot
{
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        int val=in.nextInt();
        while(val!=0)
        {
            l1.add(val);
            val=in.nextInt();
        }
        LinkedList<Integer> l2=new LinkedList<Integer>();
        int v=in.nextInt();
        while(v!=0)
        {
            l2.add(v);
            v=in.nextInt();
        }
        boolean res=l1.equals(l2);
        System.out.println(res);
    }
}
