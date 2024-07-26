import java.util.Scanner;

class printborder
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a=new int[n][n];
        int count=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=count++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 && j<n)
                {
                    System.out.print(a[i][j] + " ");
                }
                if (j==n-1 && i>0)
                {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = a.length-2; j >= 0 ; j--) {
                if(i==n-1 && j>=0)
                {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        for (int i = a.length-2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j==0 && (i>0 && i<a.length-1))
                {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16