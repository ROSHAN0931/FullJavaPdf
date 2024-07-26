import java.util.LinkedList;
import java.util.Scanner;

class occurbythree
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
        int index=0;
        for (int i = 0; i < l1.size(); i++) {
            if(l1.get(i) % 3 ==0)
            {
                index=i;
                break;
            }
        }
        System.out.println("First element divided by 3 position is " + index);
    }
}
