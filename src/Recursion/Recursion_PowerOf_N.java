package Recursion;
import java.util.*;
public class Recursion_PowerOf_N
{
    static int power_of_n(int n)
    {
        if(n == 0)
        {
            return 1 ;
        }
      
      int recursive_relation = power_of_n(n - 1) ;

        int answer = 2 * recursive_relation ;

        return answer ;

    }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in) ;

    System.out.println("Enter the value of n : ") ;

    int n = sc.nextInt() ;

    int ans = power_of_n(n) ;

    sc.close() ;

    System.out.println("The power of " + " n  is : " + ans) ;

    
  }
    
}
