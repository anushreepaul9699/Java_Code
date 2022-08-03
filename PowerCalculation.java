public class PowerCalculation {
    public static int power (int x , int n)
    {
        if(x==0 )
        {
            return 0;
        }

        if(n==0)
        {
            return 1 ;
        }
        int power_cal = power(x,n-1);
        int final_Ans = x * power_cal ;
        return  final_Ans ;

    }
    public static void main (String[] args)
    {
        int x = 2 ;
        int n = 5 ;
        int ans = power(x,n) ;
        System.out.print(ans);
    }
}
