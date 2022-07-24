import java.util.*;
import java.lang.*;
public class Fibonacci {
    public static void main (String[] args)
    {
        System.out.println("The Fibonacci Series is : ");
        int a = 0 ;
        int b = 1 ;
        System.out.print(" "+a);
        System.out.print(" "+b);
       for(int i = 2; i < 10 ;i++)
       {
           int c = a + b ;
           System.out.print(" "+c);
           a= b ;
           b= c ;
       }


    }
}
