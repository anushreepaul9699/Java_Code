package Array_Related_Questions;

//find minimum element in a rotated array in O(N LOGN)
public class Find_Pivot_In_Array
{
    static int find_pivot(int[] arr , int n)
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
    public static void main(String[] args) {
        
        //array ko declare kar rahe hai 
        int[] arr = {3,8,10,17,1} ;

        //array ka size calculate kar rhe hai
        int n = arr.length ;

        //function call ho rha hai
        int ans = find_pivot(arr,n) ;

        //answer ko print karna
        System.out.println("Printing the answer : "+ans) ;
    
    }//End of main class
    
}//End of the program
