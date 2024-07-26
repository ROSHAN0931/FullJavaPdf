import java.util.Arrays;
import java.util.Scanner;
public class sortandsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        StringBuilder sb = new StringBuilder();
        int sum =0;
        for (char c : s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                sb.append(c);
            }
            else if (Character.isDigit(c)) {
                sum =sum + Character.getNumericValue(c);
            }
        }
        char[] res = sb.toString().toCharArray();
        Arrays.sort(res);

        String result = new String(res) + sum;
        System.out.println(result);
    }
}