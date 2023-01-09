package Recursion;
import java.util.Scanner;

public class Power_a_b_Recursion 
{
    static int power_function (int a , int b)
    {
        //base case 1 
        if (b == 0)
        {
           return 1 ;
        }
        
        //base case 2
        if(a == 0)
        {
            return 0 ;
        }
        
        //Recursive Call
        int power_value = power_function(a, b - 1) ;

        return a * power_value ;

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter the value of a : ");

        int a = scanner.nextInt() ;

        System.out.println("Enter the value of b : ");

        int b = scanner.nextInt() ;

        scanner.close();

       int result =  power_function (a , b) ;

       System.out.println("The answer is : "+result) ;
    }
    
}
