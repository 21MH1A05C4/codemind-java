import java.util.*;
public class eql
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a*1+b*2;
        if(sum%2==0 &&(a>0||b%2==0))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}