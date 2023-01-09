package Recursion;
public class Sum_of_Array_Recursion 
{
    static int summation(int[] arr ,int idx , int n , int sum)
    {
        if(n == 0)
          return 0 ;

        if(n == 1)
         return arr[idx] ;

        if(idx == n)
            return sum ;

        sum = sum + arr[idx] ;

        int answer = summation (arr , idx + 1 , n , sum) ;

        return answer ;


    }
    
    public static void main(String[] args) 
    {
        int[] arr = {2,3,5,6,7} ;

        int n = arr.length ;

        int sum = 0 ;

        int ans = summation(arr , 0 ,n , sum) ;

        System.out.println("The sum is : "+ ans) ;
        
    }
}
