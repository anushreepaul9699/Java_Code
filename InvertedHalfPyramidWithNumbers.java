import java.lang.*;
public class InvertedHalfPyramidWithNumbers {
    public static void main (String[] args)
    {
        int r = 5 ;
        for(int i = 1 ; i<=r ; i++)
        {
            for(int j = 1 ; j <=r-i+1 ;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
