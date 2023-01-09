package Array_Related_Questions;

public class Reverse_Array 
{
    //Declaring the function to reverse the array
    static void reverse_array (int[] arr ,int n , int s , int e)
    {
        //base case
        if(s>e)
        {
            return ;
        }

        //processing part
        while (s <= e)
        {
            int temp = arr[s] ;
            arr[s] = arr[e] ;
            arr[e] = temp ;

            s++ ;
            e-- ;
        }//End of while loop

    }//End of function
    public static void main(String[] args) 
    {
        //Declaring the array and calculating the size of the array
        int[] arr = {1,2,3,3,5} ;
        int n = arr.length ;

        //Calling the function to reverse the array 
        reverse_array(arr,n,0,n-1) ;

        //Printing the reverse array
        for(int i = 0 ; i <n ; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
    }//End of main class
    
}//End of program
