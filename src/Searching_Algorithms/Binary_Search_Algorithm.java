package Searching_Algorithms;

public class Binary_Search_Algorithm 
{
    static boolean searching(int[] arr , int n , int s , int e , int key)
    {
        //base case-------------------------------------------
        if (s>e)
        {
            return false ;
        }

        //finding the mid
        int mid = s + (e -s) / 2 ;

        //declaring the ans variable to store the ans---------
        boolean ans = false ;
        
        //while loop taken to find the key element in the array
        while (s <= e)
        {
            if (arr[mid] == key)
            {
                ans = true ;
                return ans ;
            }

            else if (arr[mid] < key)
            {
                s = mid + 1 ;
            }

            else 
            {
                e = mid - 1 ;
            }

            mid = s + (e - s) / 2 ;

        }
        
        return false ;
    }
    public static void main(String[] args) 
    {
        //Declaring the array and calculating array size
        int[] arr = {5,1,4,2,8} ;
        int n = arr.length ;

        //Declaring the key variable--------------------
        int key = 6 ;

        //Calling the function
        boolean ans = searching(arr, n ,0, n-1, key) ;

        //Validating the ans 
        if (ans == true)
        {
            System.out.println("The element is present !") ;
        }

        else
        {
            System.out.println("The element is absent !") ;
        }
        
    }//End of main class
    
}//End of program
