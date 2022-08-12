public class ReverseVowels
{
    public static void ReverseVowelse(String s)
    {

        StringBuilder sb = new StringBuilder(s.toString()) ;

        StringBuilder sbnew = new StringBuilder() ;

        System.out.println("The original string is : "+sb);

        for(int i = 0 ; i< sb.length() ; i++)
        {
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
            {
                sbnew.append(s.charAt(i)+" ") ;
            }
        }


        System.out.println("The vowels in the string are : "+sbnew);

        String m = sbnew.toString();

        System.out.print("The reverse of the vowels are : ") ;

        for (int i = m.length()-1; i >=0 ; i--)
        {
            System.out.print(m.charAt(i));
        }

    }
    public static void main (String[] args)
    {
        String s = "anushreepaul" ;

        ReverseVowelse(s);
    }
}
