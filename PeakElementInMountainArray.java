public class PeakElementInMountainArray
{
    public static int peak(int[] arr , int n)
    {

        int ans = 0 ;

        int start = 0 ;

        int end = n - 1 ;

        int mid = start + (end - start ) / 2 ;

        while (start <= end)
        {
            if(arr[mid] < arr[mid+1])
            {
               start = mid + 1 ;
            }
            else if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            {
                ans = arr[mid] ;

                return  ans ;
            }

            else
            {
                end = mid - 1;
            }

            mid = start + (end - start) / 2 ;
        }

        return ans ;

    }

    public static void main (String[] args)
    {
        int[] arr = {3,4,5,1} ;

        int n = arr.length ;

        System.out.println(peak(arr,n) );
    }
}
