package Array_Related_Questions;

public class Check_Sorted_Rotated 
{
    //define korchi function  : 1 pair exist only -- arr[i-1] > arr[i]
    static boolean checking (int[] arr , int n)
    {
        int count = 0 ;
        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i-1] > arr[i])
            {
               count++ ;
            }
        }
        
        //if the last element is greater than the first element
        if(arr[n-1] > arr[0])
        {
            count++ ;
        }

        return count<=1 ;
    }
    //End of function
    public static void main(String[] args) 
    {
        //Ekta array declare korchi
        int[] arr = {3,4,5,1,2} ;

        //arr ka size store kar rahe hai
        int n = arr.length ;

        //function call
        boolean ans = checking(arr,n) ;

        //printing the result
        if(ans) 
        {
            System.out.println("Yes the array is sorted and rotated !") ;
        }
        
        else
        {
            System.out.println("No the array is not sorted and rotated !");
        }
        
    }//End of main class
    
}//End of the program
