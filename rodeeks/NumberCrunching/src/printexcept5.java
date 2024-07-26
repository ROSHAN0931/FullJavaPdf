import java.util.Scanner;

public class printexcept5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int val = in.nextInt();
        for (int i = 1; i <= val ; i++) {
            if(i==5)
            {
                continue;
            }
            else
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
