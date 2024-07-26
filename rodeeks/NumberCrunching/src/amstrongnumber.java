import java.util.Scanner;

public class amstrongnumber {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("enter input");
        int n = in.nextInt();
        int count=0;

        for (int i = n; i > 0 ; i=i/10) {
            count++;
        }
        System.out.println(count);
        int r;
        int t=n;
        double sum=0;
        while (n!=0)
        {
            r=n%10;//3 5
            sum=sum+Math.pow(r,count);//27+125+1=153
            n=n/10;
        }

        if (sum==t)
        {
            System.out.println("Amstrong number");
        }
        else
        {
            System.out.println("Not amstrong number");
        }
    }
}
