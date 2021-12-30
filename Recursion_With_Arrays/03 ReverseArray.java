package Recursion_With_Arrays;
import java.io.*;

class ReverseArray {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String line = br.readLine(); // to read multiple integers line
    String[] strs = line.trim().split("\\s+");
    
    int[] arr = new int[n];

    for(int i=0;i<arr.length;i++){
      arr[i] = Integer.parseInt(strs[i]);
    }
    reverse(arr,0);
  }

  public static void reverse(int[] arr, int idx){
    if(idx == arr.length){
      return;
    }

    reverse(arr, idx+1);
    System.out.println(arr[idx]);
  }
}