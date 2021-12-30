package Recursion_With_Arrays;
import java.io.*;

class FIO_BasedSubPart {
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
    
    int FI = idx;
    //Base case
    if(idx == arr.length){
      return -1;
    }

    int subPart = FIO(arr, idx+1,x);

    //if 1st indx is the key! then that indx is only passed
    if(arr[idx] == x){
      FI = idx;
    }
    //if 1st idx is not the key then it states that subPart ans is my ans
    else{      
      FI = subPart;
    }

    return FI;
  }
}