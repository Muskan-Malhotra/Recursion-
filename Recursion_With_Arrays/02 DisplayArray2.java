package Recursion_With_Arrays;

import java.io.*;

class DisplayArray2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String line = br.readLine(); // to read multiple integers line
    String[] strs = line.trim().split("\\s+");
    
    int[] arr = new int[n];

    for(int i=0;i<arr.length;i++){
      arr[i] = Integer.parseInt(strs[i]);
    }
    disp2(arr,n-1);
  }

  public static void disp2(int[] arr, int idx){
    if(idx == -1){
      return;
    }
    disp2(arr,idx-1);
    System.out.println(arr[idx]);
  }
}
