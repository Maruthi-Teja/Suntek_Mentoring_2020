import java.util.*;
import java.io.*;
class Max_min_triplet
{
     int triplet(int arr1[] ,int[] arr2,int arr3[])
     {
         int a = 0;
         int b=0;
         int c=0;
         int min = Integer.MAX_VALUE;
         while(a!=arr1.length&&b!=arr2.length&&c!=arr3.length)
         {
             int min1= Math.abs(Math.max(arr1[a],Math.max(arr2[b],arr3[c]))-Math.min(arr1[a],Math.min(arr2[b],arr3[c])));
             if(min1<min)
             min=min1;
            int  min_value= Math.min(arr1[a],Math.min(arr2[b],arr3[c]));
             if(min_value==arr1[a])
             a+=1;
             else if(min_value==arr2[b])
             b+=1;
             else
             c+=1;
         }
         return min;
     }
     void Testing()
     {
         //Test case s1
         int a1[]={1,2,3,4,5};
         int b1[]={-1,-2,3};
         int c1[]={8};
         int expected_out = 5;
         if(expected_out==triplet(a1,b1,c1))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.print("failed");
         }
         //Test case 2
         int a2[]={3,6,11};
         int b2[]={5,10,12,14,15,17};
         int c2[]={2,4,3,9};
         int expected_out2 = 2;
         if(expected_out2==triplet(a2,b2,c2))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.print("failed");
         }
         //Test case 3
         int a3[]={-5,-3,1,5,7};
         int b3[]={-10,-4,5,11,16};
         int c3[]={2,6,7};
         int expected_out3 = 1;
         if(expected_out3==triplet(a3,b3,c3))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.print("failed");
         }
         //Test case 4
         int a4[]={5,8,10,15};
         int b4[]={6,9,15,78,89};
         int c4[]={2,3,6,6,8,8,10};
         int expected_out4 = 1;
         if(expected_out4==triplet(a4,b4,c4))
         {
             System.out.println("passed");
         }
         else
         {
             System.out.print("failed");
         }
         
         
         
     }
}
class Problem5
{
    static int[] StringtoIntegerArray(String s)
    {
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for(int i=0;i<s1.length;i++)
        arr[i]=Integer.parseInt(s1[i]);
        return arr;
    }
    public static void main(String arg[]) throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str1 = in.readLine();
        String str2 = in.readLine();
        String str3 = in.readLine();
        int a[] = StringtoIntegerArray(str1);
        int b[] = StringtoIntegerArray(str2);
        int c[] =StringtoIntegerArray(str3);
        Max_min_triplet tri = new Max_min_triplet();
        System.out.print(tri.triplet(a,b,c));
        tri.Testing();
    }
    
}
