import java.util.*;
import java.io.*;
class Segmented_tree
{
    int N,X;
    int tree[]; 
    Segmented_tree(int size)
         {
          X=2*size-1;                                     //size of segment tree is 2*N-1
          tree = new int[X];                                        
         }
    void build(int node,int start ,int end,int[] A)       //building segment tree
      {
        if(start==end)                                    
        {
            tree[node-1]=A[start];
        }
        else
        {
            int mid =(start+end)/2 ;
            build(2*node,start,mid,A);                    //insert at left
            build(2*node+1,mid+1,end,A);                  //insert at right
            tree[node-1]=tree[2*node-1]+tree[2*node];     //updating internal parent node
        }
     }
    void update(int node,int start,int end,int index,int val,int[] A)   // updating the segment tree
    {
        if(start==end)
        {
            A[index]=val;                            
            tree[node-1]=val;
        }
        else
        {
            int mid=(start+end)/2;
            if(start<=index&& index<=mid)
            {
                update(2*node,start,mid,index,val,A);
            }
            else
            {
                update(2*node+1,mid+1,end,index,val,A);
                
            }
            tree[node-1]=tree[2*node-1]+tree[2*node];
        }
    }
    int query(int node, int start, int end, int l, int r)            //Query for sum of elements within range l to r
    {                                                                //   0<=l<=arraylenght-1  0<=r<arraylength-1
    if(r < start || end < l)                                         // when l and r outside the range
    {
        return 0;
    }
    if(l <= start && end <= r)                                      // when l and r are exactly in range
    {
       
        return tree[node-1];
    }
    int mid = (start + end) / 2;                                    //partially inside and outside the range
    int left_sum = query(2*node, start, mid, l, r);
    int right_sum = query(2*node+1, mid+1, end, l, r);
    return (left_sum + right_sum);
}
    void Print_Segmented_tree()                                      //Printing the segment tree
    {
        for(int i:tree)
        System.out.print(i+" ");
    }
}
class Problem2{
    public static void main(String a[]) throws IOException
     {
           BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
           int  size = Integer.parseInt(in.readLine());                  //size of the array
           String str = in.readLine();
           String[]   ch = str.split(" ");
           int arr[] = new int[size];
           for(int i=0;i<size;i++)
           arr[i]=Integer.parseInt(ch[i]);                   
           Segmented_tree segmented_tree = new Segmented_tree(size);    
           segmented_tree.build(1,0,size-1,arr);
           int Value_for_update =in.readLine();
           int index = in.readLine();
           segmented_tree.update(1,0,size-1,Value_for_update,index,arr);
           segmented_tree.Print_Segmented_tree();
           System.out.print(segmented_tree.query(1,0,size-1,l,r));      // l and r should be entered and pass into query function
    }
}
