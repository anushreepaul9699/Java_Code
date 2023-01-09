package Sorting_Algorithms;

public class Merge_Sort_Algorithm 
{
    static void sorting(int[] arr , int n , int s , int e)
    {
        //base case 
        if(s>=e)
         {
            return ;
         }
         
         //Finding the mid---------------------------------
         int mid = s + (e - s) / 2 ;

         //Recursive call---------------------------------
         sorting(arr,n,s,mid) ;
         sorting(arr, n ,mid+1 ,e) ;

         //merge function call-----------------------------
         merge(arr,n,s,e) ;
        
    }

    static void merge (int[] arr , int n , int s , int e)
    {
        //Finding the mid---------------------------------
        int mid = s + (e - s) / 2 ;

        //finding the length of first array------------------
        int l1 = mid - s  + 1 ;

        //finding the length of 2nd array-------------------
        int l2 = e - mid ;
         
        //main_index denoting the index of main_array-------
        int main_index = s ;

        //copying the elements into first array-------------
        int[] arr1 = new int[l1] ;
        
        for(int i = 0 ; i < l1 ; i++)
        {
            arr1[i] = arr[main_index++] ;
        }

        //copying the elements into 2nd array-----------------
        int[] arr2 = new int[l2] ;

        for(int i = 0 ; i < l2 ; i++)
        {
            arr2[i] = arr[main_index++] ;
        }

        //reseting the i , j , and main_index-------------------
        main_index = s ;

        //Declaring 2 new variables to point the starting index of two array--------
        int i1 = 0 ;
        int i2 = 0 ;

        while (i1 < l1 && i2 < l2)
        {
            if(arr1[i1] < arr2[i2])
            {
                arr[main_index++] = arr1[i1++] ;
            }

            else
            {
                arr[main_index++] = arr2[i2++] ;
            }

        }
        while(i1 < l1)
        {
            arr[main_index++] = arr1[i1++] ;
        }
        
        while(i2<l2)
        {
            arr[main_index++] = arr2[i2++] ;
        }

    }
    public static void main(String[] args) 
    {
        int[] arr = {5, 1, 4, 2, 8 } ;
        int n = arr.length ;

        sorting (arr , n , 0 , n - 1) ;

        //printing the array 
        System.out.println("The array after sorting is : ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ") ;
        }
        
    }
    

}
