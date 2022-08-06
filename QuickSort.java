public class QuickSort
{

    //function of sorting
    public static void sorting(int[] arr , int low , int high)
    {

        //Operations

        if ( low < high)
        {
            int pivot = partition (arr,low , high) ;

            sorting(arr,low, pivot - 1 );
            sorting (arr,pivot+1 , high) ;
        }


    }


    //partition function int type

    public static int partition (int[] arr ,int low , int high)
    {
        int pivot = arr[high] ;

        int i = low - 1 ;

        for (int j = low ; j < high ; j++)
        {
            if (arr[j] < pivot)
            {
                i++;

                //swapping

                int temp = arr[i] ;

                arr[i] = arr[j] ;

                arr[j] = temp ;

            }
        }

        i++;
        int temp = arr[i] ;
        arr[i] = pivot ;
        arr[high] = temp ;

        return i ; //pivot index


    }

    //main function

    public static void main (String[] args)
    {
        int[] arr = {6,3,9,5,2,8} ;

        int n = arr.length ;

        sorting(arr , 0 , n - 1);

        //printing the array

        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
