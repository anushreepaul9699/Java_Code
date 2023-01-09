package Sorting_Algorithms;

public class Quick_Sort_Algorithm 
{
   static void sorting_algorithm (int[] arr ,int s , int e)
    {
      //base case 
       if (s>=e)
        {
          return ;
        }

       //getting pivot index
       int p = partition(arr , s , e) ;

       //Recusive Call
       sorting_algorithm(arr, s, p-1);
       sorting_algorithm(arr, p+1, e);

    }
    
    static int partition (int[] arr ,int s , int e)
    {
      //initial consideration of pivot_index
       int pivot = arr[s] ;
      
       //taking a variable (count) to find the right place of pivot
       int count = 0 ;

       for(int i = s + 1 ; i < arr.length ; i++)
       {
          if (arr[i] <= pivot)
          {
            count++ ;
          }
       }

       //placing the pivot at right place
       int right_pivot_index = s + count ;

       //swapping the initial_pivot_index with right_pivot_index 
       int temp = arr[right_pivot_index] ;
       arr[right_pivot_index] = arr[s] ;
       arr[s] = temp ;
      
       int i = s ;
       int j = e ;
       
       //while loop taking for satisfying the condition of quick sort 
       while (i < right_pivot_index && j > right_pivot_index)
       {
         while (arr[i] <= pivot)
         {
            i++ ;
         }

         while (arr[j] > pivot)
         {
            j-- ;
         }

         while ( i < right_pivot_index && j > right_pivot_index)
         {
            int temp_variable = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp_variable ;
         }


       }

       return right_pivot_index ;
    }
    
    
   public static void main(String[] args) 
    {
        int[] arr = {5, 1, 4, 2, 8 } ;
        int n = arr.length ;
        
        //calling the sorting function-----------------------------------------------
        sorting_algorithm (arr , 0 , n - 1) ;

        //printing the array ---------------------------------------------------------
        System.out.println("The final array after sorting is : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print (arr[i]+ " ") ;
        }
        
    }
    
}
