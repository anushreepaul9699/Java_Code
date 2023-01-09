package Array_Related_Questions;

public class First_Occurence 
{
    //Declaring the function
    static int first_occurence(int[] arr , int n , int s , int e , int key)
    {
        //Finding mid
       int mid = s + ( e - s) / 2 ;

       //Declaring a variable ans to store the answer
       int ans = - 1; 

       //While loop (To find the leftmost / First occurence of the element)
         while(s<=e)
         {
          if (arr[mid] == key)
          {
            //store the ans 
             ans = mid ;

             //since we want leftmost occurence so we make e = mid - 1 
             e= mid - 1 ;

          }

          else if (arr[mid] < key)
          {
             //since the mid element is smaller than key so the key will not reside on the left side of mid 
             //so we make : s = mid  + 1 ;

              s = mid + 1 ;
          }

          else 
          {
             e = mid - 1 ;
          }

          //updating the mid
          mid = s + (e - s ) / 2 ;

       }//End of while loop

       return ans ;

    }
    public static void main(String[] args) 
    {
        //Declaring the array and calculating the array size
        int[] arr = {1,2,3,3,5} ;
        int n = arr.length ;

        //declaring the variable that hold the value to be find
        int x = 5 ;

        //calling the function to find the first_occurence
        int index_occur = first_occurence(arr,n,0,n-1 , x) ;

        //if element is not present 
        if(index_occur == -1)
        {
            System.out.println ("The element is not present in the array !") ;
        }
       
        //Printing the index of first_occurence of the element
        System.out.println("The element "+ x +" first occur at index : "+index_occur);
        
    }//End of main class
    
}//End of Program
