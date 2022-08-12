public class Solution
{
    public static int Checking (int n)
    {

        int sum = 0 ;

        while (n != 0)

        {
            sum= sum + n % 10 ;

            n = n / 10 ;

        }


        int temp = sum ;

        int s = 0;

        int r = 0 ;

        while (temp > 0 )
        {

            r = temp % 10 ;

            s = s * 10 + r ;

            temp = temp / 10 ;

        }

        if (temp == s )
        {
            return 1 ;
        }

        else
        {
            return 0 ;
        }

    }

    public static void main (String[] args)
    {
        int n = 98 ;

        System.out.println(Checking(n));
    }
}
