import java.util.HashSet;

public class UniqueSubsequence
{
   //unique_subsequence function begins
    public static void unique_Subsequence (String s , int idx , String newString, HashSet<String> map)
    {
        //base case

        if(idx == s.length())
        {
            //checking if the hashset contains the newString or not
            if(map.contains(newString))
            {
                return ;
            }

            else
            {
                System.out.println(newString);
                map.add(newString) ;
                return;
            }
        }

        //operations performed
        char curr = s.charAt(idx);
        //choice 1
        unique_Subsequence(s,idx+1,newString+curr,map);
        //choice 2
        unique_Subsequence(s,idx+1,newString,map);

    } //end of unique_subsequence function


    //main function
    public static void main (String[] args)
    {
        String s = "aaa" ;
        HashSet<String> map = new HashSet<>();
        unique_Subsequence(s,0,"",map);
    }
}
