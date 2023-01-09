package Recursion;
public class LinearSearch_Recursion 
{
    static boolean ElementFound(int[] arr , int n , int k , int idx)
    {
        if(n == 0 || idx == n)
         return false ;

         if (arr[idx] == k)
          return true ;

          boolean ans = ElementFound(arr, n, k, idx + 1) ;

          return ans ;

    }
    public static void main(String[] args) 
    {
        int[] arr = {3} ;

        int n = arr.length ;

        int k = 6 ;

        if(ElementFound(arr,n,k , 0))
        {
            System.out.println("The element is found !!");
        }

        else
        {
            System.out.println("The element is not found !!") ;
        }
        
    }
    
}
