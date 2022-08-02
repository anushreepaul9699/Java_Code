public class Recursion2 {
    public static void printing(int n )
    {
        if(n>5)
            return;
       System.out.print(n+" ");
       printing(n+1);

    }

    public static void main (String[] args)
    {
        int n = 1 ;
        printing(n);
    }
}
