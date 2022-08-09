public class SumOfArrayElements
{
    public static void SumArrayElements(int[] arr ,int n)
    {
        int sum = 0 ;

        for(int i = 0 ; i < n ; i++)
        {
            sum += arr[i] ;
        }

        System.out.println(sum);

    }
    public static void main(String [] args)
    {
        int[] arr = {6,3,9,7,1,2} ;

        int n = arr.length ;

        SumArrayElements(arr,n);

    }
}
