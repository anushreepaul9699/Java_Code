public class MatrixElementsSum
{
    public static void sum (int r , int c , int[][] arr)
    {
        int sum = 0 ;

        for (int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                sum += arr[i][j] ;
            }
        }

        System.out.println(sum);

    }

    public static void main(String[] args)
    {
        int r = 2 ;

        int c = 3 ;


        int[][] arr ={{1,0,1},{-8,9,-2}} ;

        sum(2,3,arr);
    }
}
