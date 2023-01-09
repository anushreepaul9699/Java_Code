package Recursion;
public class Selection_Sort_Recursion 
{
    static void selection_sort(int[] arr , int start , int end)
    {
        if(start > end)
           return ;
        
        int minIndex = start ;

        for(int i = start ; i <= end ; i++)
        {
            if(arr[i] < arr[minIndex])
            {
                minIndex = i ;
            }
        }

        int temp = arr[start] ; 
        arr[start] = arr[minIndex] ;
        arr[minIndex] = temp ;
        
        selection_sort(arr , start + 1 , end) ;
    }
   
    public static void main(String[] args) 
    {
       int[] arr = {2,5,1,6,9} ;

       int n = arr.length ;

       selection_sort(arr, 0, n - 1);;

       for(int i = 0 ; i < n ; i++)
       {
        System.out.print(arr[i] +" ");
       }
        
    }
    
}
