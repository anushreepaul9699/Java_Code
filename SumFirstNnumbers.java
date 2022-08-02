public class SumFirstNnumbers
{
    public static void printing(int i , int n , int sum)
    {
        if(i==n)
        {
            sum += i;
            System.out.print(sum + " ");
            return ;
        }

        sum+=i ;
        printing(i + 1, n, sum);

    }

    public static void main (String[] args)
    {
        printing(1 , 5 , 0);
    }
}
