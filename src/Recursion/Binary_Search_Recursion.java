package Recursion;
public class Binary_Search_Recursion 
{
    static boolean search (int[] arr , int s , int e , int k)
    {
        if(s > e)
          return false ;
          
        int mid = s + (e - s) / 2 ;

        if (arr[mid] == k)
          return true ;

        if(arr[mid] < k)
        {
            return search(arr,mid + 1 , e , k) ;
        }
        
        else
        {
            return search(arr , s , mid - 1 , k) ;
        }
        
    }

    public static void main(String[] args) 
    {
        int[] arr = { 2,7,8,9,11, 56} ;

        int k = 1 ;

        if (search(arr,0, arr.length - 1 , k))
        {
            System.out.println("The element is present !!") ;
        }

        else
        {
            System.out.println("The element is absent !!") ;
        }
        
    }
    
}
