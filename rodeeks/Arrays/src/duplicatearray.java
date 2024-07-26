import java.util.*;
public class duplicatearray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int s= in.nextInt();
        int[] a=new int[s];
        for (int i = 0; i < s; i++) {
            a[i]=in.nextInt();
        }
        int t[]=new int[a.length];
        int j =0;
        for (int i = 0; i < s; i++) {
            if (a[i]!=a[i+1])
            {
                t[j++]=a[i];
            }
        }
        a[j++]=a[s-1];
        for (int i = 0; i < j; i++) {
            System.out.println(a[i]);
        }

    }
}
