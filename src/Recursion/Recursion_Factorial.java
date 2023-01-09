package Recursion;
import java.util.Scanner;

public class Recursion_Factorial 
{
    static int factorial (int n)
    {
        if(n == 0)
        {
            return 1 ;
        }

        int recursion_two = factorial(n - 1) ;

        int result = n * recursion_two ;

        return result ;
    }
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number : ");
        int n = sc.nextInt() ;

        sc.close();

        int ans = factorial(n) ;

        System.out.println("The answer is : "+ans);
       
        
    }
    
}
