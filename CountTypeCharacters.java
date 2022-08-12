public class CountTypeCharacters
{
    public static void countType(String s )
    {
        StringBuilder sb = new StringBuilder(s.toString()) ;

        int upper = 0 , lower = 0 , num = 0 , special = 0 ;

        for (int i = 0 ; i < sb.length() ; i++)
        {
            if(sb.charAt(i)>='A' && sb.charAt(i) <='Z')
            {
                upper++ ;
            }

            else if(sb.charAt(i) >='a' && sb.charAt(i) <='z')
             {
                lower++ ;
             }
            else if (sb.charAt(i)>='0' && sb.charAt(i) <='9')

            {

                num++ ;

            }

            else
            {
               special++ ;
            }


        }

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(num);
        System.out.println(special);

    }

    public static void main (String[] args)
    {
        String s = "#GeeKs01fOr@gEEks07" ;

        countType(s);
    }
}
