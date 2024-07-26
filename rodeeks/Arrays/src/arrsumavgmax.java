import java.util.Scanner;

public class arrsumavgmax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int s= in.nextInt();
        int[] a=new int[s];
        for (int i = 0; i < s; i++) {
            a[i]=in.nextInt();
        }
        int sum=0;
        System.out.println("array elements are: ");
        for (int i = 0; i < s; i++) {
            sum=sum+a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of array : " + sum);
        int avg = sum / s;
        System.out.println("Average of array : " + avg);

        int max =a[0];
        for (int i = 0; i < s; i++) {
            if(max<a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum of array is : " + max);

        System.out.println("Reversed array : ");
        for (int i = s-1; i >=0 ; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int even=0,odd=0;
        for (int i = 0; i < s; i++) {
            if (a[i] % 2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Count of even " + even);
        System.out.println("Count of odd " + odd);

        int max1=0,smax=0;
        for(int n : a)
        {
            if (n>max1)
            {
                smax=max1;
                max1=n;
            }
            else if (n>smax && n!=max1)
            {
                smax=n;
            }
        }
        System.out.println("Second max is : " + smax);
    }
}
