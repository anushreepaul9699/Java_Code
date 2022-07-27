import java.lang.*;
public class Pyramid {
    public static void main(String[] args)
    {
        int r = 4 ;
        for(int i = 1 ; i<=r ; i++)
        {
            for(int j = r ; j>=i ; j--)
            {
                System.out.print(" ");
            }

            for(int k = 1 ; k <=i ; k++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
