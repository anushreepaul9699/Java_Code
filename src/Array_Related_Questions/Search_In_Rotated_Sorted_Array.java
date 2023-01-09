package Array_Related_Questions;

public class Search_In_Rotated_Sorted_Array 
{
    //binary search function
    static boolean binary_search(int[] arr ,int s , int e , int n ,int target)
    {
       
        boolean ans = false ;

        //base case 
        if(s > e)
        {
            return false ;
        }

        //main part
        int mid = s + ( e - s ) / 2 ;
        

        while (s <= e)
        {
            if(arr[mid] == target )
            {
                ans = true ;
                break ;
            }

            if(arr[mid] < target )
            {
                s = mid + 1 ;
            }

            else
            {
                 e = mid - 1 ;
            }

            mid = s + ( e - s ) / 2 ;
        }

        return ans ;

    }
    
    //find the pivot element 
    static int find_pivot(int[] arr ,int n)
    {
        int s = 0 ;
        int e = n-1 ;
       
        //base case
        if(s > e)
        {
            return -1 ;
        }

        //main part
        int mid = s + ( e - s) /2 ;

        while (s < e)
        {
            if(arr[mid] >= arr[0])
            {
                s = mid + 1 ;
            }

            else
            {
                e = mid ;
            }

            mid = s + (e -s) /2 ;
        }

        return arr[s] ;

    }
    static boolean search_rotated_sorted(int[] arr , int n , int target) 
    {
        int p = find_pivot(arr, n) ;
        
        if (arr[p] <= target && target <= arr[n - 1])
        {
            //search in second line
            return binary_search(arr, p , n-1 , n, target) ;
        }

        else 
             //search in first line
             return binary_search(arr, 0, p - 1, n, target) ;

    }//end of function
    public static void main(String[] args) 
    {
        //array declare korchi
        int[] arr = {4,5,6,7,0,1,2} ; 

        //array er size calculate korchi
        int n = arr.length ;

        //target element declare korchi
        int target = 0 ;

        //function call hochche 
        boolean isFound = search_rotated_sorted (arr , n , target) ;

        //result the print kora hochche
        if(isFound)
        {
            System.out.println("The element is found in the array !") ;
        }

        else{

            System.out.println("The element is not found in the array !" );
        }
        
    }//End of the main class
    
}//End of the program
