import java.util.ArrayList;
import java.util.Scanner;
public class withoutnvalues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        // or
        //ArrayList arr = new ArrayList();
        String s =in.nextLine();
        while (true)
        {
            if(s!="")
            {
                arr.add(s);
                s=in.nextLine();
            }
            else {
                break;
            }
        }
        System.out.println(arr);
    }
}
