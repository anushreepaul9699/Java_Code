import java.lang.* ;
import java.util.*;
public class ButterflyPrintPattern {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter the number of rows :"+" ");
        int row = scanner.nextInt();
        //First Part of the Program --------------------------------
        for(int i = 1 ; i <=row ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }

            int spaces = 2 * (row-i) ;
            for(int j = 1 ; j <=spaces ; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1 ; k <=i ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Second Part of the Program---------------------------

        for(int i = row ; i >1 ; i--)
        {
            for(int j = 1 ; j <=i; j++)
            {
                System.out.print("*");
            }
            int spaces = 2 * (row-i) ;
            for(int k = 1 ; k <= spaces ; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
