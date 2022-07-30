import java.util.*;
import  java.lang.*;
public class FindMinMax {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : "+" ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements : "+" ");
        //input
        for(int i = 0 ; i <size ;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //output
        for(int i = 0 ; i<size ;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i] ;
            }
            if(arr[i]>max)
            {
                max= arr[i] ;
            }
        }

        System.out.println("The minimum element of the array is : "+min);

        System.out.println("The maximum element of the array is : "+max);


    }
}
