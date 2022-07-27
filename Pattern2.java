import java.lang.* ;
public class Pattern2 {
    public static void main (String[] args)
    {
        int r = 5 ;
        //Part one
        for(int i = 1 ; i<=r ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

        //Part 2

        for(int i = 1 ; i<=r ; i++)
        {
            for(int j = 1 ; j<=r-i ; j++)
            {
              System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}
