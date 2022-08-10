public class PalindromicArray
{
    public static void palinArray (int[] arr , int n )
    {
        int[] rev = new int[n] ;

        int flag = 0 ;

       for (int j = arr.length - 1 ; j >=0 ; j--)
       {
           for (int i=0 ; i<rev.length ;i++)
           {
               rev[i] = arr[j] ;
               j--;
           }
       }


       for (int i = 0 ; i < n ; i++)
       {
           if (arr[i] != rev[i])
           {
               flag = 1 ;
           }

           else
           {
               i++ ;
           }
       }

       System.out.println();

       if(flag == 0)
       {
           System.out.println("Palindromic array !!");
       }

       else
       {
           System.out.println("Not a palindromic array !!");
       }


    }

    public static void main (String[] args)
    {
        int[]arr = {1,2,1} ;

        int n = arr.length ;

        palinArray(arr,n);
    }
}
