import java.lang.*;
public class ReverseStringUsingRecursion {
    public static void Reverse(String s,int n)
    {
        if(n<0)
        {
            return;
        }
        System.out.print(s.charAt(n));
        Reverse(s,n-1);

    }

    public static void main (String[] args)
    {
        String s = "abcd" ;
        int n = s.length() - 1 ;
        Reverse(s,n);
    }
}
