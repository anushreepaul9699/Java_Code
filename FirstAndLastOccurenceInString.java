public class FirstAndLastOccurenceInString
{
    public static int first = -1 ;
    public static int last = -1 ;
    public static void FirstAndLast(String s , int n,char element)
    {

        if( n == s.length() )
        {
            System.out.print(first +" "+last);
            return;
        }

        char curr_char = s.charAt(n);


        if(curr_char== element)
        {
            if(first==-1)
            {
                first = n;
            }

            else
            {
                last = n;
            }

        }

        FirstAndLast(s,n+1,element);

    }

    public static void main (String[] args)
    {
        String s = "abaacdaefaah" ;
        FirstAndLast(s,0,'a');;
    }
}
