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

}
}
