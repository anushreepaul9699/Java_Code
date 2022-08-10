public class ReplaceZero
{
    public static void replace (int[] arr , int n)
    {
        int flag = 0 ;

        for (int i = 0 ; i < n ; i++)
        {
            if(arr[i]==0)
             {
                arr[i] = 5 ;
                flag = 1 ;
             }

        }

        if(flag==0)
        {
            System.out.print("NO 0'S ARE PRESENT");
        }

        else
        {

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }

    }

    public static void main(String[] args)
    {

        int[] arr = {1,0,0,2,4,1,0} ;

        int n = arr.length ;

        replace(arr,n);

    }
}
