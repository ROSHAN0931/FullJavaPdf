import java.util.Scanner;

public class targetsum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s=in.nextInt();
        int[] a=new int[s];
        int t=in.nextInt();

        for (int i = 0; i < s; i++) {
            a[i]=in.nextInt();
        }
        int sum=0,flag=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==t){
                    System.out.println(i);
                    flag=1;
                    break;
                }
                else {
                    sum = a[i] + a[j];
                    if (sum == t) {
                        System.out.printf("%d %d", i, j);
                        flag=1;break;
                    }
                }
          }
            if(flag==1)
                break;
        }

    }
}
