public class GCD
{

    public static int findGCD (int A , int B)
    {

        if(B==0)
        {
            return A ;
        }

        return findGCD(B,A%B) ;

    }

    public static void main(String[] args)
    {
        int A = 3;

        int B = 6 ;


        System.out.print(findGCD(A,B) );
    }
}
