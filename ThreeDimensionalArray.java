import java.util.*;
import java.lang.*;
public class ThreeDimensionalArray {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of r :"+" ");
        int r = sc.nextInt();
        System.out.print("Enter the value of c :"+ " ");
        int c = sc.nextInt();
        System.out.print("Enter the value of z : "+" ");
        int z = sc.nextInt();
        int[][][] arr = new int[r][c][z];
        //input
        for(int i = 0 ; i<r ;i++)
        {
            for(int j = 0 ; j<c ;j++)
            {
                for (int k = 0 ; k<z ;k++)
                {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        //output
        for(int i = 0 ; i<r ;i++)
        {
            for(int j = 0 ; j<c ;j++)
            {
                for(int k = 0 ; k<z ;k++)
                {
                    System.out.print(arr[i][j][k]+ " ");
                }
            }
            System.out.println();
        }
    }
}
