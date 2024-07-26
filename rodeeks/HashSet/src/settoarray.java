import com.sun.source.tree.BinaryTree;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class settoarray {
    public static void main(String[] args) {
//        LinkedHashSet<String> set = new LinkedHashSet<String>();
//        set.add("A");
//        set.add("B");
//        set.add("C");
//        System.out.println("LinkedHash " + set);
//
//        String[] a=set.toArray(new String[0]);
//        for(String i : a)
//        {
//            System.out.println(i);
//        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter decimal input : ");
        String hex =in.nextLine();//80
        int decimal = Integer.parseInt(hex,16);
        String re = Integer.toBinaryString(decimal);
        System.out.println(re);
        int result=(decimal !=0 )?1:0;
        System.out.println("After converting decimal to binary");
        System.out.println(result);
    }
}
