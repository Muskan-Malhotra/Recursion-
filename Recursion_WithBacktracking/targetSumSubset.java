package Recursion_WithBacktracking;

import java.io.*;
import java.util.*;

public class targetSumSubset {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] ar = new int[n];
        
        for(int i=0;i<n;i++){
            ar[i] = Integer.parseInt(br.readLine());
        }
        int tar = Integer.parseInt(br.readLine());
        
        printTargetSumSubsets(ar,0,"",0,tar);
        
        // for(int ele:ar){
        //     System.out.println(ele+" ");
        // }

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
      
      if(idx == arr.length){   //this is important coz at last we are also checking at the last length of array after adding 0 if the sum equal to target return.
        // System.out.println(".");
        if(sos == tar){
          System.out.println(set+".");
        }
        return;
    }
      
/**if(sos == tar){
System.out.println(set+".");
return;
}

if(idx == arr.length){
System.out.println("#");
return;
}


System.out.println(set);
*/   //best to trace outpt for why it doesn't work for last lengths or 0s eg:  4 10 20 0 30 tar=30
        //yes call
        printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);
        //no call
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
        
        
    }
    

}
 
// test case
/**
 * 27
20
17
7
2
20
16
13
6
20
5
15
4
7
15
18
17
11
4
3
0
19
18
11
10
8
6
12
8
*/


