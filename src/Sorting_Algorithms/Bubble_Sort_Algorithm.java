package Sorting_Algorithms;
public class Bubble_Sort_Algorithm
{
    static void Sorting_Algorithms (int[] arr , int n)
    {
        boolean swapped = false ;
        //first loop for the rounds----------------------------------
        for(int i = 0 ; i < n - 1 ; i++)
        {
            //2nd loop for comparisons---------------------------------
            for(int j = 0 ; j < n - i - 1 ; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    //swapping-----------------------------------------
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                    swapped = true ;
                }
            }
           
            //optimised part----------------------------------------------
            if(swapped == false)
             {
                break ;
             }
        }

    }
    
    
    public static void main(String[] args) 
    {
        
        int n = 6 ;
        int[] arr = {5, 1, 4, 2, 8 ,3} ;
        
        //calling sorting function
        Sorting_Algorithms(arr,n) ;

        //printing sorted array
        System.out.println("The final array after sorting is : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        
    }
}