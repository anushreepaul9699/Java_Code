
public class ReplaceZeroWithFive
{
    public static int convertFive(int n)
    {
        //add code here.

        StringBuilder s = new StringBuilder(Integer.toString(n)) ;

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(s.charAt(i)=='0')
            {
                s.setCharAt(i,'5');
            }
        }

        String sb = s.toString() ;

        int number = Integer.parseInt(sb) ;

        return number ;


    }

    public static void main (String[] args)
    {
        int n = 1005678 ;

        System.out.print(convertFive(n)+" ") ;
    }
}