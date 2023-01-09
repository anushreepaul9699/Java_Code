package Recursion;
import java.util.* ;
public class  Fibonacci_Recursion 
{
    static int fibonacci (int n)
    {
        //base case 1
        if (n == 0 )
        {
            return 0 ;
        }
       //base case 2
        if(n == 1)
        {
            return 1 ;
        }

       int recursive_relation = fibonacci(n - 1) + fibonacci(n-2) ;

       return recursive_relation ;
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in) ;

        System.out.println("Enter the value of n : ") ;

        int n = sc.nextInt() ;

        sc.close() ;

        int answer = fibonacci(n) ;

        System.out.println(answer) ;


        

    }
    
}
