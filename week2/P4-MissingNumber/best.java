import java.util.*;
import java.io.*;
class MissingNumber{
   int  missing(int[] arr,int start,int end)  
    {
        if(start>end)
        {
        return -1;
        }
        if(start==end)                                // this is the case where number is missing so return its index
        {
        return start+1;
        }
        int mid=(start+end)/2;
        if(arr[mid]<=mid+1)                           //travel to the right half of array
        {
        return missing(arr,mid+1,end);
        }                   
        return missing(arr,start,mid);             // travel to left half of array
  }
  void Testing()                       //testing different test cases
    {
        //Test case 1
        int[] arr1 ={6,7,9,11,13,15};
        int Excepted_output = 1;
        if(Excepted_output==missing(arr1,0,arr1.length-1))
        {
        System.out.println("passed");
        }
        else{
        System.out.println("failed");
         }
          //Test case 2
        int[] arr2 ={1,2,3,4,5,8};
        int Excepted_output2 =6;
        if(Excepted_output2==missing(arr2,0,arr2.length-1))
        {
        System.out.println("passed");
        }
        else{
        System.out.println("failed");
         }
          //Test case 3
        int[] arr3 ={1,2,4,5,6};
        int Excepted_output3 = 3;
        if(Excepted_output3==missing(arr3,0,arr3.length-1))
        {
        System.out.println("passed");
        }
        else{
        System.out.println("failed");
         }
          //Test case 4
        int[] arr4 ={1,2,3,4,5,6,7,8,9,10,15};
        int Excepted_output4 = 11;
        if(Excepted_output4==missing(arr4,0,arr4.length-1))
        {
        System.out.println("passed");
        }
        else{
        System.out.println("failed");
         }
        
    }
    }
class Problem4
{
    public static void main(String a[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int size = Integer.parseInt(in.readLine());             //size of array 
         String str = in.readLine();   
         String[] ch = str.split(" ");
         int arr[] = new int[size];
         for(int i=0;i<size;i++)
         arr[i]=Integer.parseInt(ch[i]);
         MissingNumber find  = new MissingNumber();
         System.out.println(find.missing(arr,0,size-1));            //passing the array and printing corresponding missing number
         find.Testing();
    }
}
