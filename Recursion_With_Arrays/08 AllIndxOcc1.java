package Recursion_With_Arrays;
import java.io.*;

class AllIndxOcc1 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] ar = new int[n];
    String line = br.readLine();
    String[] str = line.split(" ");

    for(int i=0;i<ar.length;i++){
      ar[i] = Integer.parseInt(str[i]);
    }

    int x = Integer.parseInt(br.readLine());

    int[] ans = allIndxOcc(ar,0,0,x);
    for(int i=0;i<ans.length;i++){
      System.out.println(ans[i]);
    }

  }

  public static int[] allIndxOcc(int[] ar, int idx, int fsf, int x){
    //fsf == found so far

    if(idx == ar.length-1){
      int[] ans = new int[fsf];
      return ans;
    }

    if(ar[idx] == x){
      fsf++;
    }

    int[] ansarr = allIndxOcc(ar, idx+1, fsf, x);

    if(ar[idx] == x){
      ansarr[fsf-1] = idx;
    }

    return ansarr;
  }
}