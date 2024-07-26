import java.util.*;
public class frequencyelement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        while (!s.equals("exit"))
        {
            colors.add(s);
            s=in.nextLine();
        }
        System.out.println("Elements in list " + colors);
        int count=0;
        System.out.println("Enter element to find frequency");
        String ele=in.nextLine();
        for(String i : colors)
        {
            if(i.equals(ele))
            {
                count ++;
            }
        }
        System.out.println("Frequency of " + ele + " is " + count);
    }
}
