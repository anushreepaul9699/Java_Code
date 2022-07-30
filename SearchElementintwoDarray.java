import java.util.*;
import java.lang.*;
public class SearchElementintwoDarray {
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

        System.out.println("Enter the search element : ");
        int x = sc.nextInt();
        int flag = 0 ;
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j<columns ;j++)
            {
                if(arr[i][j]==x)
                {
                    System.out.println("The element was found at "+"("+i +","+j +") "+"index");
                    flag = 1 ;
                    break ;
                }
            }
        }

        if(flag==0)
        {
            System.out.println("The element was not found !!");
        }


    }
}
