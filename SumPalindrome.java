public class SumPalindrome
{
    public static void findrev(int n,int rev)
    {

        int sum = 0 ;

        int temp = n ;

        while (temp > 0 )
        {
            rev = temp % 10 ;

            sum = sum * 10 + rev ;

            temp = temp / 10 ;
        }


        sum(n,sum);

    }

    public static void  sum (int n , int sum)
    {


        int c = 0 ;

        c = n + sum ;


        SumPlaindromeChecking(n,c);

    }

    public static void SumPlaindromeChecking (int n,int c)
    {

        int s = 0 ;

        int t = c ;

        int r = 0 ;


        while (c > 0)
        {
             r = c % 10 ;

             s = s * 10 + r ;

             c = c / 10 ;


        }


        if(t==s)
        {
            System.out.println("Yes");
        }

        else
        {
            System.out.println("No");
        }

    }
    public static void main (String[] args)
    {
        int n = 23 ;

        findrev(n , 0);



    }
}
