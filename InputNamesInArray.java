import java.util.*;
import java.lang.*;
public class InputNamesInArray {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :"+" ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        System.out.print("Taking the input : "+" ");
        for(int i = 0 ; i<size ; i++)
        {
            arr[i] = sc.next();
        }

        System.out.print("Printing the elements of the array :");
        for (int i = 0 ; i<size ;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
