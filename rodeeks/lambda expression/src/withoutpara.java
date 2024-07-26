import java.util.Scanner;

interface abc
{
    public int cal(int a,int b);
}

class withoutpara
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        abc i = (a,b) ->
        {
            return a+b;
        };

        abc j = (a,b) ->
        {
            return a*b;
        };

        System.out.println(i.cal(n1,n2));
        System.out.println(j.cal(n1,n2));
    }
}