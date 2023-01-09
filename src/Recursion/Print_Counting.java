package Recursion;
import java.util.Scanner;

public class Print_Counting 
{
    static void print_count (int n)
    {
        //base case 
        if (n == 0)
        {
            return ;
        }
        
        //printing count in reverse order
        System.out.print(n + " ");

        print_count(n - 1) ;

  }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the number : ");

        int n = sc.nextInt() ;
        
        sc.close();

        print_count(n);
        
    }
    
}
