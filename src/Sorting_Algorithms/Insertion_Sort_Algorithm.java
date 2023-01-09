package Sorting_Algorithms;

public class Insertion_Sort_Algorithm 
{
    static void sorting(int[] arr , int n)
    {
        //1st loop----------------------------(For comparing current element)
        for(int i = 1 ; i < n ; i++)
        {
            int temp = arr[i] ;
            int j = i - 1 ;

            //2nd loop------------------------(For deciding the right place of the current element)
            for(;j>=0;j--)
            {
                if(temp < arr[j])
                {
                    arr[j+1] = arr[j] ;
                }

                else
                {
                    break ;
                }
            }
            
            //Placing the element in the right place---------------------------------------------------
           
            arr[j+1] = temp ;
        
        }//End of Function-----------------------------------------------------------------------------

        
    }
    public static void main(String[] args) 
    {
        int[] arr = {5, 1, 4, 2, 8 } ;
        int n = arr.length ;

        //calling the function --------------------------------------------------------------------------
        sorting(arr,n) ;

        //printing the array elements--------------------------------------------------------------------
        System.out.println("The array after sorting is : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
