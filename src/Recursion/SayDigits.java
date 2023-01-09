package Recursion;
import java.util.Scanner;

public class SayDigits 
{
    static void SayDigits_Recursion (int n , String[] arr)
    {
        if (n == 0)
        {
            return ;
        }

        int number = n % 10 ;

        n = n / 10 ;

        SayDigits_Recursion(n, arr);

        System.out.print(arr[number] + " ");

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the value of  n : ");

        int n = sc.nextInt() ;

        sc.close();

        String arr[] = {"zero" , "one" ,"two" ,"three" ,"four" , "five" , "six" , "seven" , "eight" , "nine" } ;

        SayDigits_Recursion(n , arr) ;
        
    }
    
}
