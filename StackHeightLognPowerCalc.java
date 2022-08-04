public class StackHeightLognPowerCalc {
    public static int power_calc (int x , int n)
    {
        if(n==0)
            return 1 ;
        if(x==0)
            return 0 ;
        // if n is even
        if(n%2==0)
        {
           return  power_calc(x,n/2) * power_calc(x,n/2);
        }

       // if n is odd

        else
        {
            return power_calc(x,n/2) * power_calc(x,n/2) * x ;
        }


    }
    public static  void main (String[] args)
    {
        int x = 2 ;
        int n = 5 ;
        int ans = power_calc(x,n) ;
        System.out.println(ans);
    }
}
