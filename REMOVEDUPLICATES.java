public class REMOVEDUPLICATES
{
    public static  boolean[] map = new boolean[26];

    public static void remove_dup (String s , int idx ,String newString)
    {
        //base case

        if(idx==s.length())
        {
            System.out.print(newString);
            return ;
        }
        //Operations

        char curr = s.charAt(idx) ;

        if(map[curr - 'a'])
        {
            remove_dup(s,idx+1,newString);
        }

        else
        {
            newString += curr;
            map[curr-'a']= true ;
            remove_dup(s,idx+1,newString);
        }



    }

    public static  void main (String[] args)
    {

        String s = "bbcaddb" ;

        remove_dup(s,0,"");
    }
}
