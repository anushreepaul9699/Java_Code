package Array_Related_Questions;

public class Find_Duplicate_Number_Approach2
{
     //finding duplicate number in an array in O(N) - time complexity  : O(N) - space complexity
     static int find_duplicate (int[] arr , int n)
     {
        //taking another array
        int[] frequency_array = new int [n + 1]; 

        int n1 = frequency_array.length;

        //initialising frequency_Array with 0
        for(int i = 0 ; i < n1 ; i++)
        {
            frequency_array[i] = 0 ;
        }

        //traversing original array to count the frequency of the array elements
        for(int i = 0 ; i < n ; i++)
        {
            if(frequency_array[arr[i]] == 0)
            {
                frequency_array[arr[i]] += 1 ;
            }

            else
            {
                //return the duplicate element if count is > 1
                return arr[i] ;
            }
        }//end of for loop

        return 0 ;
      
    }//End of functiom
    public static void main(String[] args) 
    {
        //declaring the array 
        int[] arr = {1,3,4,2,2} ;

        //calculating the size of the array 
        int n = arr.length ;

        //calling the function
        int ans = find_duplicate(arr , n) ;

        //printing the duplicate number 
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
