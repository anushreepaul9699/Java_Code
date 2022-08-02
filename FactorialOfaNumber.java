public class FactorialOfaNumber
{
    public static void  factorial (int fact , int n , int i)
    {
        if(n==i)
        {
            fact = fact * i ;
            System.out.print(fact+" ");
            return ;
        }
        fact = fact * i ;
        factorial(fact , n , i+1) ;
    }

    public static void main (String[] args)
    {
        factorial(1 ,5,1);
    }
}
