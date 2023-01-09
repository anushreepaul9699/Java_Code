package Array_Related_Questions;

public class Palindromic_Array 
{
    //function take define korchi
    static boolean palindrome_array (int[] arr ,int n)
    {
        int s = 0 ;
        int e = n - 1 ;

        //base case
        if(s > e)
        {
            return false ;
        }

        //processing part
        while(s <= e)
        {
            if(arr[s] != arr[e])
            {
               return false ;
            }

            s++ ;
            e-- ;
        }

        return true ;
    }
    //End of the function
    public static void main(String[] args) 
    {
        //Ekta array declare korchi 
        int[] arr = {1,2,2,1} ;

        //Ei array tar size calculate kore n e rakhchi
        int n = arr.length ;

        //function take call korchi
        boolean ans = palindrome_array(arr,n) ;

        //ans ta print korchi true / false 
        if(ans)
        {
            System.out.println("Yes the arrray is a plaindromic array ! ") ;
        }

        else
        {
            System.out.println("No the array is not a palindromic array !") ;
        }
        
    }//End of main class
    
}//End of the program
