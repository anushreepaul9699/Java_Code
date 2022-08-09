public class SecondLargestElement
{
    static int print2largest(int arr[], int n)
    {
        // code here

        for(int i = 0 ; i < n -1 ; i++)
        {
            int greater = i ;

            for(int j = i+1 ; j<n ;j++)
            {
                if(arr[j] > arr[greater])
                {
                    greater = j ;
                }
            }

            int temp = arr[greater] ;

            arr[greater] = arr[i] ;

            arr[i] = temp ;

        }

        int res = arr[1] ;

        return res ;
    }

    public static void main (String[] args)
    {
        int[] arr = {12,35,1,10,34,6} ;

        int n = arr.length ;

        print2largest(arr,n) ;

        System.out.print("The array after sorting is : "+" ");

        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.print("The 2nd largest element is : "+print2largest(arr,n) );


    }
}