import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = in.nextInt();
        int arr[][]=new int[rows][];
        int columns = 0;
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter " + i + " columns : ");
            columns=in.nextInt();
            arr[i]=new int[columns];
        }
        int count=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=count++;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
