import java.util.*;
import java.io.*;

public class BitManipulation4 
{
    public int findMinReplacements(int n)        // method to find Minimum Replacements
    {
          if(n==1)
          return 0;
          else if((n&1)==0)
          return 1+findMinReplacements(n>>1);
          else
           return 1+Math.min(findMinReplacements(n-1),findMinReplacements(n+1));
        
    }
    public  void Testing() //Method to test for different types of test cases
    {
        //TestCase1
        int test1=8;
        int ans1=findMinReplacements(test1);
        int exp1=3;
        if(ans1==exp1)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase2
        int test2=9;
        int ans2=findMinReplacements(test2);
        int exp2=4;
        if(ans2==exp2)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase3
        int test3=13;
        int ans3=findMinReplacements(test3);
        int exp3=5;
        if(ans3==exp3)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
        //TestCase4
        int test4=21;
        int ans4=findMinReplacements(test4);
        int exp4=6;
        if(ans4==exp4)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
         //TestCase5
        int test5=101;
        int ans5=findMinReplacements(test5);
        int exp5=9;
        if(ans5==exp5)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
class Problem4
{
    public static void main(String a[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input= Integer.parseInt(in.readLine());
        BitManipulation4 b= new BitManipulation4();         // creating a object for Bitmanipulation
         int output=b.findMinReplacements(input);
         System.out.println(output);
         b.Testing();                                       
    }
}
