import java.util.Scanner;

public class commonin3digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("enter size : ");
        int s = in.nextInt();
        int s2 = in.nextInt();
        int s3 = in.nextInt();
        int[] a = new int[10];
        while (s != 0) {
            a[s % 10]++;
            a[s2 % 10]++;
            a[s3 % 10]++;
            s /= 10;
            s2 /= 10;
            s3 /= 10;
        }
        for (int ele : a) {
                System.out.print(ele + " ");
        }
    }
}
