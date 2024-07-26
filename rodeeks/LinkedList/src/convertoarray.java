import java.util.LinkedList;
import java.util.Scanner;

class convertoarray
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
        System.out.println("List is " + l1);
        String[] arr=l1.toArray(new String[l1.size()]);
        System.out.println("Array is ");
        for(String i : arr)
        {
            System.out.println(i);
        }
    }
}
