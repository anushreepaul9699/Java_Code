package Array_Related_Questions;

public class Last_Occurence 
{
    //Declaring the function to find the last occurence
    static int last_occurence (int[] arr ,int n , int s , int e , int key)
    {
        //Finding the mid 
        int mid = s + (e - s) / 2 ;

        //Declaring a variable to hold the ans 
        int ans = -1 ;

        //While loop(To find the last occurence of the element)
        while (s<=e)
        {
            if(arr[mid]== key)
            {
                ans = mid ;
                s = mid + 1 ;
            }

            else if (arr[mid] < key)
            {
                s = mid + 1 ;
            }

            else 
            {
                e = mid - 1 ;
            }

            mid = s + (e - s) /2 ;
        }//End of while Loop

        return ans ;
        
    }//End of function
    public static void main(String[] args) 
    {
        //Declaring the array and calculating the size of the array
        int[] arr = {1,2,3,3,5} ;
        int n = arr.length ;

        //Declaring the variable that hold the element to be found
        int x = 9 ;

        //Declaring the variable that hold the index of the last occurence
        int index_occur = last_occurence(arr , n , 0 , n - 1 , x) ;

        //if no occurence found of the above element
        if (index_occur == -1)
        {
            System.out.println("No such occurence of the element found in the array !") ;
        }
        else
        {
            //printing the index of the element(in case of index_occur != -1)
            System.out.println("The element "+ x +" last occur at index : "+index_occur);
        }

        
    }//End of main class
    
}//End of program
