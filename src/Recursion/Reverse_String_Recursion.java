package Recursion;
public class Reverse_String_Recursion 
{
    static StringBuilder ReverseString(StringBuilder str , int s , int e)
    {
        if(s>e)
          return str ;

        char a = str.charAt(s) ;
        char b = str.charAt(e) ;

        str.setCharAt(s, b);
        str.setCharAt(e, a);

        s++ ;
        e-- ;

        //without end pointer just compare it with (s ,n - i - 1 )

        return ReverseString(str, s, e);

    }

    public static void main(String[] args) 
    {
        StringBuilder str =  new StringBuilder("Anushree") ;

        str = ReverseString(str , 0 , str.length() - 1) ;

        System.out.println("The reverse string is : "+str) ;
        
    }
    
}
