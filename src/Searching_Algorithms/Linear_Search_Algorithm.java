package Searching_Algorithms;

public class Linear_Search_Algorithm
{
    //Declaring the searching function---------------------------
    static boolean searching (int[] arr ,int n , int key)
    {
        //base case
        if(n <= 0)
        {
            return false ;
        }

        //Main processing part(For loop taken to traverse the array)
        boolean ans = false ;
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] == key)
            {
                ans = true ;
            }
        }

        return ans ;
    }
    public static void main(String[] args) 
    {
        //Declaring the array and calculating the array size using .length function
        int[] arr = {5,1,4,2,8} ;
        int n = arr.length ;

        //declaring the key---------------------------------------------------------
        int key = 7 ;

        //calling the function ------------------------------------------------------
        boolean ans = searching(arr,n,key) ;

        //validating the ans---------------------------------------------------------
        if(ans == true)
         {
            System.out.println("The key is found in the array !") ;
         }

         else 
         {
            System.out.println("The key is not found in the array !") ;
         }
        
    }//End of main class
    
}//End of program
