public class Find_Pivot_In_Rotated_array
{
    public static int find_pivot (int[] arr , int n)
    {
        int start = 0 ;

        int end = n - 1 ;

        int mid = start + (end-start) / 2 ;

        while (start < end)
        {
            if(arr[mid] >= arr[0])
            {
                start = mid + 1 ;
            }

            else
            {
                end = mid ;
            }

            mid = start + (end - start) / 2 ;
        }

        return  start ;

    }

    public static void main (String[] args)
    {
        int[] arr = {7,9,1,2,3} ;

        int n = arr.length ;

        System.out.println(find_pivot(arr,n) ) ;
    }
}
