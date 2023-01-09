package Array_Related_Questions;

public class Merge_Two_Sorted_Array 
{
    //Declaring the function
    static void merge(int[] a , int a1 , int[] b , int b1 , int[] c)
    {
        //index1 to point array 'a' 
        int index1 = 0 ;
        
        //index2 to point array 'b'
        int index2 = 0 ;

        //k to point merged array starting index
        int k = 0 ;

        //while loop to compare two elements of two arrays and placed it into merged array
        while (index1 < a1 && index2 < b1)
        {
            if(a[index1] < b[index2])
            {
                c[k++] = a[index1++];
            }

            else
            {
                c[k++] = b[index2++] ;
            }
        }//end of while loop

        //if any of the array remains non-empty
        while(index1 < a1)
        {
            c[k++] = a[index1++];
        }

        while(index2 < b1)
        {
            c[k++] = b[index2++] ;
        }

    }//End of function
    public static void main(String[] args) 
    {
        //Declaring two array a & b--------------
        int[] a = {1,3,5,7,9} ;
        int a1 = a.length ;

        int[] b = {2,4,6} ;
        int b1 = b.length ;


        //Printing two array-----------------------
        System.out.println("The first array is : ");
        for(int i = 0 ; i < a1 ; i++)
        {
            System.out.print(a[i]+" ") ;
        }
        
        System.out.println();
        
        System.out.println("The second array is : ");
        for(int i = 0 ; i < b1 ; i++)
        {
            System.out.print(b[i]+ " ");
        }

        //Declaring 3rd array-------------------------
        int[] c = new int [a1 + b1] ;

        //Calling the merge function-------------------
        merge(a,a1,b,b1,c) ; 

        System.out.println() ;

        //printing the merge array--------------------
        System.out.println("The merged array is : ");
        for(int i = 0 ; i < c.length ; i++)
        {
            System.out.print(c[i]+ " ") ;
        }
        
    }//End of main class
    
}//End of program
