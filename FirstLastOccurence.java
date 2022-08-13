public class FirstLastOccurence
{
    public static int first_occurence(int[] arr , int n ,int k)
    {

        int ans = 0;

        int start = 0 ;

        int end = n - 1 ;

        int mid = start + (end - start)/2 ;

        while(start<=end)
        {
            //condition 1

            if(arr[mid]==k)
            {
               ans = mid ;

               end = mid - 1 ;
            }

            //condition 2

            else if(arr[mid]>k)
            {
                end = mid - 1 ;
            }

            //condition 3

            else if(arr[mid]<k)
            {
                start = mid + 1 ;
            }

            mid = start + (end - start)/ 2 ;
        }

        return ans ;


    }

    public static int last_occurence(int[] arr,int n,int k)
    {

        int ans = 0;

        int start = 0 ;

        int end = n - 1 ;

        int mid = start + (end - start)/2 ;

        while(start<=end)
        {
            //condition 1

            if(arr[mid]==k)
            {
                ans = mid ;

                start = mid + 1 ;
            }

            //condition 2

            else if(arr[mid]>k)
            {
                end = mid - 1 ;
            }

            //condition 3

            else if(arr[mid]<k)
            {
                start = mid + 1 ;
            }

            mid = start + (end - start)/ 2 ;
        }

        return ans ;

    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,3,4,5,6,7};

        int n = arr.length;

        int k = 3 ;

        System.out.println("The first occurence of 3 is at index "+first_occurence(arr,n,k));

        System.out.println("The last occurence of 3 is at index "+last_occurence(arr,n,k));



    }
}
