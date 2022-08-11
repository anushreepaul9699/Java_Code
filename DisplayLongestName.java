public class DisplayLongestName
{
    public static String longest(String names[], int n)

    {

        int a = 0 ;

        for(int i = 0 ; i < names.length ; i++)
        {
            if(names[a].length() <names[i].length())
            {
                a = i ;
            }
        }

        return names[a] ;


    }

    public static void main(String[] args)
    {
        String[] names = {"Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks"} ;

        int n = names.length ;

        System.out.print(longest(names,n)+" ") ;
    }
}