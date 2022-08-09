public class ValueEqualToIndexValue
{
    public static void EqualtoIndexValue (int[] arr, int n)
    {
        int num = 4 ;

        if(arr[num] == num)
        {
            System.out.print("Here arr["+num+"]"+" "+"="+" "+arr[num]+" "+"exists ");

        }

        else
        {
            for(int i = 0 ; i < n ; i++)
            {
                if(i==arr[i])
                {
                    System.out.println("Here only arr["+i+"]"+" "+"="+" "+arr[i]+" "+"exists ");
                }
            }
        }
    }

    public static void main (String[] args)
    {
        int[] arr = {7,1,2,8,24,9} ;

        int n = arr.length ;

        EqualtoIndexValue(arr,n) ;
    }
}
