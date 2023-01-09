package Array_Related_Questions;

public class Sort_0_1_2 
{
    //Definning the function
    static void sort(int[] arr ,int n)
    {
        //Dutch National flag Algorithm : 3 pointers approach 
       // mid = 0 , lo = 0 , hi = n -1 
       //if arr[mid] == 0 : swap (arr[lo] , arr[mid]) lo++ , mid++ ;
       //if arr[mid] == 1 : mid++;
       //if arr[mid] == 2 ; swap(arr[mid] , arr[hi]) hi-- ;
       
        int mid = 0 ;

        int lo = 0 ;

        int hi = n - 1 ;

        int temp = 0 ;

        while (mid <= hi)
        {
            switch(arr[mid])
            {
                case 0 : 
                          temp = arr[lo] ;
                          arr[lo] = arr[mid] ;
                          arr[mid] = temp ;
                          lo++ ;
                          mid++;

                          break ;

                case 1 :  
                         mid++ ;
                         break ;

                case 2 : temp = arr[mid] ;
                         arr[mid] = arr[hi] ;
                         arr[hi] = temp ;

                         hi-- ;

                         break ;
            }
            
        }


        
    }
    public static void main(String[] args) 
    {
        //Declaring the array
        int[] arr = {0,1,1,0,2,1} ;
        
        //Calculating the size of the array
        int n = arr.length ;

        //calling the function
        sort(arr, n) ;

        //printing the array after sorting 0's 1's & 2
        System.out.println("The array after sorting is  :");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }//End of main class
    
}//End of the program
