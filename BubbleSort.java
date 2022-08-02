import java.lang.*;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : " + " ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements : " + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The initial array is : " + " ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sorting(Bubble Sort)

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
       System.out.println();

        //Printing the Sorted Array

        System.out.println("The Final Array after sorting is : "+" ");
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");

        }

    }
}
