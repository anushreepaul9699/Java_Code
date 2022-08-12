public class Swapping
{
    public static void swap (int a , int b )
    {
        int temp = a ;

        a = b ;

        b = temp ;

        System.out.println(a);

        System.out.println(b);

    }

    public static void main (String[] args)
    {
        int a = 13 ;

        int b = 9 ;

        swap(a,b);
    }
}
