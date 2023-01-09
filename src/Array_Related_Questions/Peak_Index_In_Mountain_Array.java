package Array_Related_Questions;

public class Peak_Index_In_Mountain_Array 
{
    //Definning the function
    static int find_peak_index (int[] arr , int n)
    {
        int s = 0 ;
        int e = n - 1 ;
        int mid = s + ( e- s) / 2 ;

        //base case 
        if(s > e)
        {
            return -1 ;
        }

        //main part
        while (s < e)
        {
            if(arr[mid] < arr[mid + 1])
            {
                 s = mid + 1 ;
            }

            else
            {
                e = mid ;
            }

            mid = s + (e - s) / 2;
        }

        return arr[s] ;
    }
    public static void main(String[] args) 
    {
        //declaring the array
        int[] arr = {0,10,5,2} ;

        //calculating the size of the array
        int n = arr.length ;

        //calling the function
        int ans = find_peak_index(arr,n) ;

        //printing answer
        System.out.println("The peak index 's element is : "+ans) ;
        
    }//End of main class
    
}//End of the program
