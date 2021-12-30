package Recursion_With_Arrays;
import java.io.*;

class LastIndxOcc2 {
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
    int ans = LIO(arr,0,x);
    System.out.println(ans);
  }


  public static int LIO(int[] arr, int idx,int x) {
    
    //Base case
    if(idx == arr.length){
      return idx-1;
    }
    

  
    int LI = LIO(arr, idx+1,x);
    
    if(LI == 0){
      return -1;
    }

    if(arr[LI] == x){
      return LI;
    }
    
    // System.out.println(idx);
    return idx;

  }
}