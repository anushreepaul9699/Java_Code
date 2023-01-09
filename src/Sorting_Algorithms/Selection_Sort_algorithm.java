package Sorting_Algorithms;

public class Selection_Sort_algorithm 
{
    static void sorting (int[] arr , int n)
    {
        //first loop---------------------(For placing right element at right index)
        for(int i = 0 ; i < n ; i++)
        {
            int min = i ;

            //2nd loop-------------------(to find the ith min element)
            for(int j = i + 1 ; j < n ; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j ;
                }

                else
                 {
                    break ;
                 }
            }

            //swapping (arr[i] , arr[min])-------------------------------
            int temp = arr[min] ;
            arr[min] = arr[i] ;
            arr[i] = temp ;
        }

    }
    public static void main(String[] args) 
    {
        int[] arr = {5, 1, 4, 2, 8 } ;
        int n = arr.length ;
       
        //function call---------------------------------------------------
        sorting(arr,n) ;

        //printing the array----------------------------------------------
        System.out.print("The array after sorting is : ") ;
        for(int i = 0 ; i < n ; i++)
         {
            System.out.print(arr[i] + " ");
         }
        
    }
    
}
