package Array_Related_Questions;

import java.util.Arrays;

public class Find_Duplicate_Number_Approach1 
{
    //definning the function
    //T(N) = O (n logn) + O(n) : in case if you use merge sort to sort the array
    static int find_duplicate(int[] arr , int n)
    {
        //Sorting the array
        Arrays.sort(arr);

        //main part
        for(int i= 0 ; i < n -1 ; i++)
        {
            if(arr[i] == arr[i+1]) 
            {
               return arr[i] ;
            }
        }

        return -1 ;

    }//End of function
    public static void main(String[] args) 
    {
        //declare the array 
        int[] arr = {1,3,4,2,2} ;

        //calculating the size of the array
        int n = arr.length ;

        //calling the function 
        int ans = find_duplicate(arr,n) ;

        //printing the  array 
        System.out.println("Printing the array : ") ;
   
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ") ;
        }

        System.out.println() ;

        //Printing the duplicate element 
        if(ans == -1)
        {
            System.out.println("No duplicate element exists") ;
        }

        else
        {
            System.out.println("The duplicate element is : "+ans) ;
        }
        
    }//End of main class
    
}//End of the program
