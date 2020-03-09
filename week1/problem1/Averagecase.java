package bitmanupilation;

import java.util.Arrays;

public class problem1 {
	// function for bit manipulation
           static int[] Xor(int[] array,int[] queries)
           {
        	   int arr[] =new int[queries.length/2];
        	   int c=0;
        	   
        	   for(int i=0;i<queries.length;i+=2)
        	   {
        		   int result=0;
        		   for(int j=queries[i];j<=queries[i+1];j++)
        		   {
        			   result=result^array[j];
        		   }
        		   arr[c++]=result;
        	   }
        		   return arr;
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   int[][] input = {{1,3,4,8},{1,8,0,1,3,4},{0,0,0,0,0,0,0},{1,1,1,1,1},{100,0,200,45}};
                   int[][] queries = {{0,1,1,2,0,3,3,3},{0,0,0,4,1,4,4,4,4,5},{0,3,0,2,0,5,1,5},{0,3,0,2,0,4,1,2},{0,3,1,3,3,3,2,3,1,2}};
                   int[][] output =new int[input.length][];
                   int[][] expected_out = {{2,7,14,8},{1,11,10,3,7},{0,1,0,0},{0,1,1,0},{129,229,45,229,200}};
                  
                   for(int i=0;i<input.length;i++)
                   {
                	   output[i]= Xor(input[i],queries[i]);
                   }
                   Testing();
                //Testing
                   for(int i=0;i<expected_out.length;i++)
                   {
                	   if(Arrays.equals(output[i],expected_out[i]))
                		   System.out.println("Passed");
                	   else
                		   System.out.println("Failed "+(i+1)+"rd case");
                   }
             
                   
                   
	}

}
