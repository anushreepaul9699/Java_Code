import java.util.Scanner;

public class InsertionSort {
    public static  void main (String[] args)
    {
        System.out.print("Enter the size of the array : " + " ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements : " + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //initial array
        System.out.println("The initial array is : " + " ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        for(int i = 1 ; i<n ; i++)
        {
            int current = arr[i] ;
            int j = i - 1 ;

            while(j>=0 && current < arr[j])
            {
                arr[j+1] = arr[j] ;
                j-- ;
            }

            arr[j+1] = current ;

        }

        System.out.println("The final array is : "+" ");
        for(int i = 0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
