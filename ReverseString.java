import java.lang.*;
public class ReverseString {
    public static void main (String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder("Anushree");

        System.out.println("The initial string is : "+stringBuilder);

        for(int i = 0 ; i<stringBuilder.length()/2 ; i++)
        {
            //Calculating index
            int front = i ;
            int back = stringBuilder.length() - i - 1 ;

            //Getting Character

            char front_Char = stringBuilder.charAt(front);
            char back_Char = stringBuilder.charAt(back) ;

            //Setting Character

            stringBuilder.setCharAt(front,back_Char);
            stringBuilder.setCharAt(back,front_Char);

        }

        //Printing the String

        System.out.print("The reverse String is : ");

        System.out.println(stringBuilder);

    }
}
