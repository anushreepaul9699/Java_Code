import java.lang.*;
public class RandomNumber {
    public static void main(String[] args)
    {
        int min = 200 ;
        int max = 400 ;
        System.out.print("The Random number between "+min+" "+"to"+" "+max+" "+"is :");
        int b = (int)(Math.random()*(max-min+1)+min) ;
        System.out.print(b + " ");

    }
}
