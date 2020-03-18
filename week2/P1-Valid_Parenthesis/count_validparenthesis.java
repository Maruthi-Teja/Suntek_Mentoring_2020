import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class Valid_Parathesis
 {
     
     int count=0;
     int PrintValidParathesis(int open,int close) //Printing the valid Parenthesis of n using recurssion
     {
         
         if(open==0&&close==0)                    //when open and close brackets completes print thee string
         {
             count++;                              //add 1 to count
         }
         if(open>close)                            //we should only print right bracket if open  left bracket is already open 
         {
             return 0;
         }
         if(open>0)                                //printing the left bracket
         {
             PrintValidParathesis(open-1,close);
         }
         if(close>0)                                //printing the right bracket
         {
          PrintValidParathesis(open,close-1);
         }
         
         return count;
         
     }
 void Testing()
     {
         //Test case1
         int test1=2;
         int expected_out1=2;
         if(expected_out1==PrintValidParathesis(test1,test1))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.println("failed");
         }
         //Test case2
         int test2=10;
         int expected_out2=16796;
         if(expected_out2==PrintValidParathesis(test2,test2))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.println("failed");
         }
         //Test case3
         int test3=5;
         int expected_out3=42;
         if(expected_out3==PrintValidParathesis(test3,test3))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.println("failed");
         }
         //Test cas4
         int test4=7;
         int expected_out4=429;
         if(expected_out4==PrintValidParathesis(test4,test4))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.println("failed");
         }
         //Test case5
         int test5=8;
         int expected_out5=1430;
         if(expected_out5==PrintValidParathesis(test5,test5))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.println("failed");
         }
     }
  
 
 }
public  class Problem1 
{
public static void main(String a[]) throws IOException
{
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    int  number =Integer.parseInt(b.readLine());                   // enter the number 
    Valid_Parathesis validparathesis = new Valid_Parathesis();
    int n =validparathesis.PrintValidParathesis(number,number);
    System.out.print(n);
    validparathesis.Testing();
}
}
