package Recursion;
public class Bubble_Sort_Recursion 
{
    static void sorting (int[] arr , int n)
    {
        //base case 
        if(n==0 || n == 1)
          return ;
        
        int temp = 0 ;
        //solving 1 case 
        for(int i = 0 ; i < n - 1 ; i++)
        {
            if(arr[i] > arr[i+1])
              {
                temp = arr[i] ;
                arr[i] = arr[i+1] ;
                arr[i+1] = temp ;
              }
              
        }
         
        //Recursive call
        sorting(arr , n - 1) ;  

    }
    public static void main(String[] args) 
    {
        int[] arr = {1,8,5,2,9,3,4} ;
        int n = arr.length - 1 ;
        sorting(arr,n) ;
        
        System.out.println("The sorted array is : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +" ") ;
        }
        
    }
    
}
