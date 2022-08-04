public class TowerOfHanoi
{
    //function of tower of hanoi
    public static void towerofhanoi_func (int n , String src ,String helper , String des)
    {
        //Base case of Recursion
        if(n==1)
        {
            System.out.println("Transfer disk "+n+"from"+" "+src+" "+des);
            return ;
        }

        //Operation performed

        //step one
        towerofhanoi_func(n-1,src,des,helper);
        System.out.println("Transfer disk "+" "+n+"from"+src+" "+des);
        //step two
        towerofhanoi_func(n-1,helper,src,des);

    }
    //main function
    public static void main (String[] args)
    {
        int n = 3 ;
        towerofhanoi_func(n,"S","H","D");
    }
}
