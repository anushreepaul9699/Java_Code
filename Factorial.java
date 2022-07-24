import java.util.*;
import java.lang.*;
public class Factorial {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : " + " ");
        int n = scanner.nextInt();
        int fact = 1 ;
        for (int i = 1 ; i <= n ; i++)
        {
            fact = fact * i ;
        }

        System.out.println("The factorial of the number is : "+fact);
    }
}
