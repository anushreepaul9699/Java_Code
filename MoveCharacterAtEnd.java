public class MoveCharacterAtEnd {

    //Function

    public static void MoveAtEnd (String  s , int idx ,int count,String newString)
    {

        //base case
        if(idx==s.length())
        {
            for(int i = 0 ; i<count ; i++)
            {
                newString = newString + 'x' ;
            }
            System.out.print(newString);
            return ;
        }

        //Operations

        char curr = s.charAt(idx) ;

        if(curr=='x')
        {
            count =  count + 1 ;
            MoveAtEnd(s,idx+1,count,newString);
        }

        else
        {
            newString = newString + curr ;

            MoveAtEnd(s,idx+1,count,newString);
        }


    }

    public static void main (String[] args)
    {
        String s = "axbcxxd";
        MoveAtEnd(s,0,0,"");
    }
}
