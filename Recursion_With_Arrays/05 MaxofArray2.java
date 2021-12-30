package Recursion_With_Arrays;
import java.io.*;

class MaxofArray2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String line = br.readLine(); // to read multiple integers line
    String[] strs = line.trim().split("\\s+");
    
    int[] arr = new int[n];

    for(int i=0;i<arr.length;i++){
      arr[i] = Integer.parseInt(strs[i]);
    }
    int ans = Max(arr,0);
    System.out.println(ans);
  }

  
  public static int Max(int[]arr, int idx){

    //Base case
    if(idx == arr.length){
      return arr[arr.length-1];
    }

    int subMax = Max(arr, idx+1);

    // System.out.println(subMax);
    if(arr[idx]>subMax){
      subMax= arr[idx];
    }
    return subMax;
  }
}
