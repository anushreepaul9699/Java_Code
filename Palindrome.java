import java.util.*;
import java.lang.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : " + " ");
        int original = scan.nextInt();
        int reverse = 0 ,sum = 0 , temp = 0 ;
        temp = original ;
        while(original>0)
        {
            reverse = original%10 ;
            sum = sum * 10 + reverse ;
            original = original / 10 ;

        }

        if(temp == sum)
        {
            System.out.println("It is a palindrome number");
        }

        else
        {
            System.out.println("It is not a palindrome number ");
        }

    }
}
