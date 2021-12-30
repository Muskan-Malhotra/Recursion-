package Recursion_With_Arrays;
import java.io.*;

class LastIndxOcc {
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
    LIO(arr,0,x);
    // System.out.println(ans);
  }

  public static int LI = 0;
  public static void LIO(int[] arr, int idx,int x) {
    
    //Base case
    if(idx == arr.length){
      System.out.println(LI);
      return;
    }
    
    if(arr[idx] == x){
      LI = idx;
    }

    LIO(arr, idx+1,x);

    // System.out.println("a: "+ a);
    return;
  }
}