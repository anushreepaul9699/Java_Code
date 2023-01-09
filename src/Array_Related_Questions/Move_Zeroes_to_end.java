package Array_Related_Questions;

public class Move_Zeroes_to_end 
{
    //Declaring the function to move zeroes to end
    static void move_zeroes_end (int[] arr ,int n)
    {
        int temp = 0 ;
        int i = 0 ;

        //fOR Loop to traverse the array and move the zeroes to first by swapping (arr[j] , arr[i]) when arr[j] != 0
        for(int j = 0 ; j < n ; j++)
        {
            if(arr[j] != 0)
            {
               //swapping (arr[i] , arr[j])
                temp = arr[j] ;
                arr[j] = arr[i] ;
                arr[i] = temp ;

                i++ ;
            }


        }
        
        

    }//End of function
    public static void main(String[] args) 
    {
        //Declaring the array and calculating the size of the array
        int[] arr = {0,1,0,3,12} ;
        int n = arr.length ;

        //printing the initial array 
        System.out.println("The initial array is  : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ");
        }

        //calling the function to move zeroes to end
        move_zeroes_end (arr , n) ;

        //printing the final array after moving zeroes to end
        System.out.println() ;
        System.out.println("The array after moving zeroes to end  :") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
    }//End of main class
    
}//End of the program
