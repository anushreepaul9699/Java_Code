package Array_Related_Questions;

public class Move_Negative_Integer_To_One_Side
{
    //function ko define kar rhe hai
    static void moving_negative_integer(int[] arr , int n)
    {
        //i point kar rha hai non-negative integer ko
        int i = 0 ;
        int temp = 0 ;

        for(int j = 0 ; j < n ; j++)
        {
            //agar negative integer milta hai to swap kar do i ke sath fir i ek barha do
            if(arr[j]<0)
            {
               if(i!=j)
               {
                //swapping ho rha hai
                 temp = arr[j] ;
                 arr[j] = arr[i] ;
                 arr[i] = temp ;
               }
               // i ek bar rha hai
               i++ ;
            }
        }//end of for loop
    }
    //end of function
    public static void main(String[] args) 
    {
        //array declare korchi 
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9 } ;

        //calculating the array size 
        int n = arr.length ;

        //calling the function
        moving_negative_integer(arr,n) ;

        //printing the result 
        System.out.println("Printing the resultant array : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
