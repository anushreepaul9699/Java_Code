package Recursion;
public class Check_Palindrome_Recursion 
{
    static boolean Check_Palindrome (String str , int s , int e)
    {
        if (s > e)
        {
            return true ;
        }
        
        if (str.charAt(s) != str.charAt(e))
        {
            return false ;
        }

       else
       {
         return Check_Palindrome(str, s+1 ,  e - 1);
       }
        
       
    }

    public static void main(String[] args) 
    {
         String str = "aba" ;
         boolean ans = Check_Palindrome(str, 0, str.length() - 1) ;

         if(ans) 
         {
            System.out.println("Yes it is palindrome !");
         }

         else
         {
            System.out.println("No it is not a palindrome !");
         }


        
    }
    
}
