public class Subsequence
{
    //function
    public static  void subsequece (String s , int idx , String newString)
    {

        //base case

        if(idx == s.length())
        {
            System.out.println(newString);
            return;
        }

        char curr = s.charAt(idx) ;

        //choice 1

        subsequece(s,idx+1 , newString+curr);

        //choice 2

        subsequece(s,idx+1,newString);

    }

    //main function

    public static void main (String[] args)
    {
        String s = "abc" ;
        subsequece(s,0,"");
    }


}
