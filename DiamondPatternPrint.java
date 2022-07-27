import java.lang.*;
public class DiamondPatternPrint {
    public static void main(String[] args)
    {
        int r = 5 ;
        //Pyramid Star
        for(int i = 1 ; i<=r ; i++)
        {
            int j;
            for (j = r; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*" + " ");
            }

            System.out.println();

        }

        //Reverse Pyramid

        for(int i = 1 ; i <=r ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(" ");
            }

            for(int k = 1 ; k <=r-i+1 ; k++)
            {
                System.out.print("*"+" ");
            }

            System.out.println();

        }

    }
}
