import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class Valid_Parathesis
 {
     void PrintValidParathesis(int open,int close ,String str) //Printing the valid Parenthesis of n using recurssion
     {
         
         if(open==0&&close==0                       //when open and close brackets completes print thee string
         {
             System.out.println(str);
         }
         if(open>close)                            //we should only print right bracket if open  left bracket is already open 
         {
             return;
         }
         if(open>0)                                //printing the left bracket
         {
             PrintValidParathesis(open-1,close,str+"(");
         }
         if(close>0)                                //printing the right bracket
         {
          PrintValidParathesis(open,close-1,str+")");
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
    String s= "";                                                   //initially string is null
    validparathesis.PrintValidParathesis(number/2,number/2,s);      
}
}
