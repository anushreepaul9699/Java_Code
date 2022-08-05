import java.util.Scanner;

public class ArraySortedOrNot {

    public static  boolean SortedOrNot (int[] arr ,int idx)
    {

        boolean decission = false ;

        //base case

        if(idx == arr.length - 1)
            return decission;

        //Operations

        if(arr[idx] < arr[idx+1])
        {
           decission = true ;
        }

        else
        {
            decission = false ;
        }

       return SortedOrNot(arr,idx+1) ;



    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the size of the array : "+" ") ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        System.out.print("Enter the elements of the array :"+" ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        SortedOrNot(arr,0);

        if(SortedOrNot(arr,0))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}
