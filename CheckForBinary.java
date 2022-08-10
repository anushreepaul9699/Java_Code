public class CheckForBinary
{
    public static void  checking(String s)
    {
        boolean res = false ;

        for(int i = 0 ; i < s.length() - 1 ; i++)
        {
            if(s.charAt(i) > '1')
            {
                res = false ;
            }

            else
            {
                res = true ;
            }
        }

        System.out.println(res);

    }

    public static void main(String[] args)
    {
        String s = "1011" ;

        checking(s);
    }
}
