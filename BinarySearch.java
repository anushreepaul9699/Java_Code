public class BinarySearch
{
    public static  int binarysearch(int arr[], int n, int k)
    {
        // code here

        int s = 0 ;

        int e = n - 1 ;

        int mid = s + (e-s) / 2 ;

        while (s<=e)
        {
            if(arr[mid]==k)
            {
                return mid ;
            }

            if(k > arr[mid])
            {
                s = mid+1 ;
            }

            else
            {
                e = mid - 1 ;
            }

            mid = (s + e) / 2 ;
        }

        return - 1 ;
    }

    public static void main (String[] args)
    {
        int[] arr = {1,2,3,4,5} ;

        int n = arr.length ;

        int k = 4 ;

        System.out.println(binarysearch(arr,n, k) );
    }
}
