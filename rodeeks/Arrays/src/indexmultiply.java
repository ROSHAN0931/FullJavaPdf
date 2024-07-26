import java.util.*;
public class indexmultiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s=in.nextInt();
        int []arr=new int[s];
        for (int i = 0; i < s; i++) {
            arr[i]=in.nextInt();
        }
        int m[]=new int[s];
        for (int i = 0; i < s; i++) {
            m[i]=1;
            for (int j = 0; j < s; j++) {
                if(i!=j)
                {
                    m[i]*=arr[j];
                }
            }
        }
        for (int i = 0; i < s; i++) {
            System.out.print(m[i] + " ");
        }
    }
}