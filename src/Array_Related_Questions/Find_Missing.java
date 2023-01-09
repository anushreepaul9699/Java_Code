package Array_Related_Questions;

public class Find_Missing 
{
    static int missing_number(int[] arr ,int n)
    {
        int[] frequency_array = new int [n + 1] ;

        int ans = -1 ;
        
        //initialising the array with 0 
        for(int i = 0 ; i < frequency_array.length ; i++)
        {
            frequency_array[i] = 0 ;
        }
       
        //storing the count
        for(int i = 0 ; i < n ; i++)
        {
            frequency_array[arr[i]] += 1 ;
        }
        
        //searching which one is zero (not present)
        for(int i = 0 ; i < frequency_array.length ; i++)
        {
            if(frequency_array[i] == 0)
            {
                ans = i ;
            }
        }

        return ans ;


    }//End of function
    public static void main(String[] args) 
    {
        //declaring the array 
        int[] arr = {3,1,2,5,3 ,4,7} ;
        int n = arr.length ;

        //calling the function 
        int ans = missing_number(arr, n );

        //printing the result

        System.out.println("The missing number is : "+ans) ;
        
    }
    
}
