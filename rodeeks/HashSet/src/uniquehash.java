import java.util.*;
public class uniquehash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();//nec
        System.out.println("Given string is " + s);
        HashSet<Character> set = new HashSet<Character>();
        boolean b = true;
        //n e c
        for(char c : s.toCharArray())
        {
            if(!set.add(c))//n
            {
                b=false;
                break;
            }
            else
            {
                set.add(c);//n e c
            }
        }
        System.out.println("values in set" + set);
        if(b)
        {
            System.out.println("Unique");
        }
        else
        {
            System.out.println("Not Unique");
        }
    }
}
