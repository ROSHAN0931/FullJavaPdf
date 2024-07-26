import java.util.ArrayList;
import java.util.Scanner;

public class replacecondition {
    public static void main(String[] args) {
        ArrayList<Integer> ai=new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements");
        int n = in.nextInt();;
        while(n>0)
        {
            ai.add(n);
            n=in.nextInt();
        }
        System.out.println(ai);
        System.out.println("element for condition");
        int t = in.nextInt();
        System.out.println("element to insert");
        int insert=in.nextInt();
        for(int i=0;i<ai.size();i++)
        {
            if(ai.get(i)>t)
            {
                ai.set(i,insert);
            }
        }
        System.out.println("after replacing" + ai);
    }
}
