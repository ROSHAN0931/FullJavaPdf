import java.util.LinkedList;
import java.util.Scanner;

public class listpalindrome
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
        int left=0;
        int right=l1.size()-1;

    }
}
