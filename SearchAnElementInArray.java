import java.util.*;
import java.lang.*;
public class SearchAnElementInArray {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : " + " ");
        int size = scanner.nextInt();
        int[] arr =new int[size] ;
        //Taking the input

        System.out.print("Enter the elements of the array : " + " ");
        for(int i = 0 ; i<size ; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element you want to search : "+" ");
        int x = scanner.nextInt();
        //Searching the element
        int flag= 0;
        for(int i = 0 ; i<size ; i++)
        {
            if(arr[i]==x)
            {
                System.out.print("The item found at index :"+" "+(i+1));
                flag = 1 ;
                break ;
            }

        }

        if(flag==0)
        {
            System.out.print("Item was not  found !!");
        }


    }
}
