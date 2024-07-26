import java.util.LinkedList;
import java.util.Scanner;

class removeevennumbers
{
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<Integer>();
        LinkedList<Integer> update = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        int val=in.nextInt();//red
        while(val!=0)
        {
            l1.add(val);
            if(val%2!=0)
            {
                update.add(val);
            }
            val=in.nextInt();
        }
        System.out.println("original List " + l1);
        System.out.println("Updated List " + update);
    }
}
