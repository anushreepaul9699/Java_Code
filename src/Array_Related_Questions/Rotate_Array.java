package Array_Related_Questions;

public class Rotate_Array 
{
    //function definning 
    static void rotate_array (int[] arr ,int n , int k)
    {
        int[] temp = new int [n] ;

        for(int i = 0 ; i < n ; i++)
        {
            temp[(i+k)%n] = arr[i] ;
        }

        for(int i = 0 ; i < temp.length ; i++)
        {
            arr[i] = temp[i] ;
        }
    }
    public static void main(String[] args) 
    {
        //declare array
        int[] arr = {1 , 7 , 9 , 11} ;
        int n = arr.length ;

        //declaring the kth index value
        int k = 2 ;

        //calling the function 
        rotate_array(arr,n,k) ;

        //printing the resultant array
        System.out.println("The final array after rotating is : ") ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
    }//End of main class
    
}//End of the program
