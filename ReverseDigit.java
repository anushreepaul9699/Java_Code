public class ReverseDigit
{
    public static void reverseigit (int n)
    {

        int sum = 0 ;

        int rev = 0 ;

        while (n > 0)

        {
            rev = n % 10 ;

            sum = sum * 10 + rev ;

            n = n / 10 ;

        }

        System.out.println(sum);

    }

    public static void main (String[] args)
    {

        int n = 76543 ;

        reverseigit(n);

    }
}
