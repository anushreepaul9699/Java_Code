package Array_Related_Questions;

public class Maximum_Subarray_Sum 
{
    static int max_sum_subarray(int[] arr , int n)
    {
        //Considering the maximum sum is the first element's value
        int maximum_sum = arr[0] ;
        
        //taking a variable Sum to calculate initial sum 
        int Sum = 0 ;
        
        //Kadane's Algorithm : take subarray as soon as sum is >= 0
        for(int i = 0 ; i < n ; i++)
        {
           Sum = Sum + arr[i] ;

           if(Sum >  maximum_sum)
           {
             maximum_sum = Sum ;
           }
           
           //if sum is negative then set it to zero
           if(Sum < 0)
           {
             Sum = 0 ;
           }
        }

        return maximum_sum ;
    }
    public static void main(String[] args) 
    {
        //Declaring an array 
        int[] arr = {-2 , -3 , 4 , - 1, -2 , 1 , 5 ,-3} ;
        
        //calculating array size 
        int n = arr.length ;

        //calling the sum to get maximum subarray sum 
        int max_sum = max_sum_subarray(arr,n) ;

        //printing the maximum sum 
        System.out.println("The maximum subarray sum is :"+ " "+max_sum) ;

        
    }//End of main class
    
}//End of the program
