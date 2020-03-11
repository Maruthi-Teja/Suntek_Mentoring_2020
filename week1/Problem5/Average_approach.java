import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class BitManuplication
{
    public ArrayList<Integer> no_Of_Set_bits(int number)
    {
       ArrayList<Integer> output= new ArrayList<>();
        for(int i=0;i<=number;i++)
        {
            int count=0;
            if(i==0)
            output.add(0); // if number  is 0 there is no set bits in number
            else{
            int n=i;
            while(n>0) // we has to remove left most setbit 
            {           // until number becomes 0 to count number set bits               
            count++;
            n=n&(n-1);
            }
            output.add(count);} 
        }
        return output;
    
    }
    public boolean test(Integer[] a ,int[] b)
    {
        for(int i=0;i<a.length;i++)
        {
             if(a[i]==b[i])
            System.out.println("Passed");
            else
            {
            return false;
            }
             
        }
        return true;
    }
    public  void Testing_differnt_cases()
    {
         //TestCase1
        int test1=3;
        ArrayList<Integer> out= no_Of_Set_bits(test1);
         int expected_output[] ={0,1,1};
         Integer  output[] = (Integer[])out.toArray();
             if(test(output,expected_output))
            System.out.println("Passed");
            else
            System.out.println("Failed");
           //TestCase2
        int test2=8;
        ArrayList<Integer> out2= no_Of_Set_bits(test2);
         int[] expected_output2 = {0,1,1,2,1,2,2,3,1};
         Integer  output2[] = (Integer[])out2.toArray();
             if(test(output2,expected_output2))
            System.out.println("Passed");
            else
            System.out.println("Failed");
           //TestCase3
        int test3=10;
        ArrayList<Integer> out3= no_Of_Set_bits(test3);
         int expected_output3[] ={0,1,1,2,1,2,2,3,1,2,2};
         Integer  output3[] = (Integer[])out.toArray();
             if(test(output3,expected_output3))
            System.out.println("Passed");
            else
            System.out.println("Failed");
         //TestCase4
        int test4=15;
        ArrayList<Integer> out4= no_Of_Set_bits(test4);
         int expected_output4[] ={0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4};
         Integer  output4[] = (Integer[])out.toArray();
             if(test(output4,expected_output4))
            System.out.println("Passed");
            else
            System.out.println("Failed");
           //TestCase5
        int test5=0;
        ArrayList<Integer> out5= no_Of_Set_bits(test5);
         int expected_output5[] ={0,1,1};
         Integer  output5[] = (Integer[])out.toArray();
             if(test(output5,expected_output5))
            System.out.println("Passed");
            else
            System.out.println("Failed");
    }
}
public class Problem5 {
    public static void main(String a[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int number =Integer.parseInt(br.readLine());
        int expected_output[][] ={ {0,1,1},{0,1,1,2,1,2,2,3,1},{0,1,1,2,1,2,2,3,1,2},{0,1,1,2}};
        BitManuplication b = new BitManuplication();
            ArrayList<Integer> ou=b.no_Of_Set_bits(number);
    }
}
