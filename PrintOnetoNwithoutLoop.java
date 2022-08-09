public class PrintOnetoNwithoutLoop
{
    public static void print(int idx, int n)
    {
        if(idx > n)
        {
            return ;
        }

        System.out.print(idx+" ");

        print(idx+1 , n);


    }

    public static void main (String[] args)
    {
        int n = 10 ;

        print(1,n);
    }
}
