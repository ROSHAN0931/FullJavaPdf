import java.util.ArrayList;
import java.util.Scanner;

public class specificelement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        while (!s.equals("exit"))
        {
            colors.add(s);
            s=in.nextLine();
        }
        System.out.println(colors);
        System.out.println("enter element to get index ");
        String ele=in.nextLine();
        int index= colors.indexOf(ele);
        System.out.println("Index of " + ele +" is " + index);
    }
}