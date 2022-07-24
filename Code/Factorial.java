package Code;
import java.util.*;
import java.lang.*;
public class Factorial {

    public static void main (String[] args)
    {
        System.out.println("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        for(int i = 1 ; i <= n ; i++)
        {
            fact = fact * i ;
        }

        System.out.println("The factorial is " +fact);
    }

}
