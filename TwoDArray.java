import java.lang.*;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args)
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
        }
        //printing the output
        System.out.println("The array elements are :");
        for(int i = 0 ; i<rows ;i++)
        {
            for(int j = 0 ; j<columns ;j++)
            {

                System.out.print(arr[i][j]+ " ");
            }
        }


    }
}
