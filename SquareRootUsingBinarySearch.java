public class SquareRootUsingBinarySearch
{
    public static int find_square_root (int n)
    {

        int s = 0 ;

        int e = n ;

        int mid = s + (e - s ) / 2 ;

        int ans = 0 ;

        while (s<=e)
        {
            if((mid*mid)== n )
            {
                return mid ;
            }

            else if ( (mid*mid)>n)
            {
                e = mid - 1 ;
            }

            else
            {
                ans = mid ;

                s = mid + 1 ;
            }

            mid = s + (e - s)/2 ;
        }

        return ans ;

    }

    public static void main (String[] args)
    {
        int n = 36 ;

       System.out.println(find_square_root(n)) ;
    }
}
