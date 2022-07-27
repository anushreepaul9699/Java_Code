import java.lang.*;
public class NumberPyramid {
    public static void main (String[] args)
    {
        int r = 4 ;
        for(int i = 1 ; i<=r ; i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
