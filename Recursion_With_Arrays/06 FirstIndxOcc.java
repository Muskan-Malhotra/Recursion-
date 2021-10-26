package Recursion_With_Arrays;
import java.io.*;

class FirstIndxOcc {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int x = Integer.parseInt(br.readLine());
    String line = br.readLine(); // to read multiple integers line
    String[] strs = line.trim().split("\\s+");
    
    int[] arr = new int[n];

    for(int i=0;i<arr.length;i++){
      arr[i] = Integer.parseInt(strs[i]);
    }
    int ans = FIO(arr,0,x);
    System.out.println(ans);
  }

  public static int FIO(int[] arr, int idx,int x) {
    
    //Base case
    if(idx == arr.length){
      return -1;
    }

    if(arr[idx] == x){
      return idx;
    }

    int a = FIO(arr, idx+1,x);

    return a;
  }
}