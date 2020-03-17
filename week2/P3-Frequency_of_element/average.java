import java.io.*;
import java.util.*;
class Frequency
{
    int freq(int[] array,int K)               //function to find frequency of element 
    {
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(K==array[i])
            count++;
        }
        return count;
    }
    void Testing()                       //testing different test cases
    {
        //Test case 1
        int[] arr1 ={1,2,3,4,5,2,1};
        int K=2;
        int Excepted_output = 2;
        if(Excepted_output==freq(arr1,K))
        {
        System.out.println("passed");
        }
        else{
        System.out.println("failed");
         }
         //Test case 2
        int[] arr2 ={10,-2,44,55,55,-3,1};
        int K2=55;
        int Excepted_output2 = 2;
        if(Excepted_output2==freq(arr2,K2)){
        System.out.println("passed");
        }
        else{
        System.out.println("failed");
         }
         //Test case 3
        int[] arr3 ={1,1,1,1,1,1,1,1};
        int K3=1;
        int Excepted_output3 = 8;
        if(Excepted_output3==freq(arr3,K3))
        {
        System.out.println("passed");
        }
        else
        {
        System.out.println("failed");
        }
         //Test case 4
        int[] arr4 ={100,200,5,11,22,33,44};
        int K4=10;
        int Excepted_output4 = 0;
        if(Excepted_output4==freq(arr4,K4))
        {
        System.out.println("passed");
        }
        else
        {
        System.out.println("failed");
        }
    }
}
class Problem3
{
    public static void main(String a[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());           //enter size of array
        String str= in.readLine();                           // enter elements of array
        String[] ch = str.split(" ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        arr[i] = Integer.parseInt(ch[i]);
        int K = Integer.parseInt(in.readLine());   // enter element to find its Frequency
        Frequency frequency = new Frequency();
        System.out.println(frequency.freq(arr,K));
        frequency.Testing();
    }
}
