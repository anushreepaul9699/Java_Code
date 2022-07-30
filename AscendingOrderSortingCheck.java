import java.lang.*;
import java.util.*;
public class AscendingOrderSortingCheck {
    public static void main(String[] args)
    {
        boolean isacending = true ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array  :"+" ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements : "+" ");
        //input
        for(int i = 0 ; i<size ;i++)
        {
            arr[i] = sc.nextInt();
        }

        //checking

        for(int i = 0 ; i< size-1 ; i++)
        {
            if (arr[i] > arr[i + 1]) {
                isacending = false;
                break;
            }
        }

        if(isacending)
        {
            System.out.println("The array is sorted in ascending manner ");
        }
        else
        {
            System.out.println("The array is not sorted in ascending manner ");
        }

    }
}
