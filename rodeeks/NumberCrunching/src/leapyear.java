import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();

        if(y % 400 ==0)
        {
            System.out.println("Leap Year");
        }
        else if (y % 4 ==0 && y % 100 !=0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
