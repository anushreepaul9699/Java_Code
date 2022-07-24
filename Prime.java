import java.lang.*;
import java.util.*;
public class Prime {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : " +" ");
        int a = scan.nextInt();

        int flag = 0 , m = 0 ;

         m = a /2 ;

        if(a==0 || a==1)
        {
            System.out.print("The number is not Prime");
        }

        else {
            for(int i = 2 ; i <=m ; i++)
            {
                if(a%i==0)
                {
                    System.out.println("The number is not prime");
                    flag = 1 ;
                    break ;
                }
            }
        }

        if(flag==0)
        {
            System.out.println("The number is prime ");
        }
    }
}
