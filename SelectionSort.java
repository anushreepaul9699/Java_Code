import java.util.*;
import java.lang.*;
public class SelectionSort {
    public static void main (String[] args)
    {
        System.out.print("Enter the size of the array : " + " ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements : " + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //initial array
        System.out.println("The initial array is : " + " ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0 ; i < n - 1 ; i++)
        {
            int smallest = i ;

            for(int j = i+1 ; j < n ; j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest = j ;

                }
            }

            int temp = arr[smallest] ;
            arr[smallest] = arr[i] ;
            arr[i] = temp ;
        }
        System.out.println();
        //printing the array
        System.out.println("The final array after sorting is : ");
        for(int i = 0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
