public class Recursion1
{
    public static void printnumber(int n )
    {

        if(n==0)
        {
            return;
        }

        System.out.print(n + " ");

        printnumber(n - 1);


    }
    public static void main (String[] args)
    {
        int n = 5 ;

        printnumber(n);



    }
}
