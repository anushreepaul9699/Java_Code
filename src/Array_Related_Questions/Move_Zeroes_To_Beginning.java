package Array_Related_Questions;

public class Move_Zeroes_To_Beginning 
{
    //Declaring function to move zeroes to beginning
    static void move_zeroes_to_beginning(int[] arr ,int n)
    {
        int temp = 0 ;
        int i = 0 ;
        
        //fOR Loop to traverse the array and move the zeroes to first by swapping (arr[j] , arr[i]) when arr[j] == 0
        for(int j = 0 ; j < n ; j++)
        {
            if(arr[j] == 0)
            {
                temp = arr[j] ;
                arr[j] = arr[i] ;
                arr[i] = temp ;

                i++ ;
            }
        }
    }//End of Function
    public static void main(String[] args) 
    {
        //Declaring array and calculating array size
        int[] arr = {0,1,0,3,12} ;
        int n = arr.length ;

        //calling the function
        move_zeroes_to_beginning(arr,n) ;

        //printing final array
        System.out.print("The array after moving zeroes to beginning : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ") ;
        }
        
    }//End of main class
    
}//End of program
