import java.lang.*;
public class SolidRectanglePrint {
    public static void main(String[] args)
    {
        int rows = 5 ;
        System.out.println("Printing Rectangle :");
        for(int i = 1 ; i<=rows ; i++)
        {
            for(int j = 1 ; j <=rows ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
