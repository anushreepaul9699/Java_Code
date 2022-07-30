import java.util.*;
import java.lang.*;
public class TransposeTwoDMatrix {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to take :");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns you want to take :");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns] ;
        //input
        System.out.println("Enter the array elements : ");
        for(int i = 0 ; i<rows ; i++)
        {
            for(int j = 0 ; j<columns ; j++)
            {
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        //Printing The transpose
        System.out.println("The transpose of the 2D matrix is : ");
        for(int j= 0 ; j <columns ;j++)
        {
            for(int i = 0 ; i<rows ;i++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
