import java.lang.*;
import java.util.*;
public class SpiralTraveral2DArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows :" + " ");
        int r = sc.nextInt();
        System.out.print("Enter the value of columns :" + " ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        //input
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //printing the initial 2D-Array
        System.out.println("The initial array is : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println(" ");
        }

        //Sprial traversal

        int row_start = 0;
        int row_end = r - 1;
        int col_start = 0;
        int col_end = c - 1;

        System.out.println("The Spiral Traversal of the array is : ");

        while (row_start <= row_end && col_start <= col_end) {
            //first part
            for (int i = col_start; i <= col_end; i++) {
                System.out.print(arr[row_start][i] + " ");

            }
            row_start++;
            System.out.println();

            //Second Part

            for (int i = row_start; i <= row_end; i++) {
                System.out.print(arr[i][col_end] + " ");

            }

            System.out.println();

            col_end--;

            //Third Part

            for (int i = col_end; i >= col_start; i--) {
                System.out.print(arr[row_end][i] + " ");

            }

            row_end--;

            System.out.println();

            //Fourth Part

            for (int i = row_end; i >= row_start; i--) {
                System.out.print(arr[i][col_start]+" ");

            }

            col_start++;

            System.out.println();



        }

    }
}
