package Recursion_With_Arrays;

import java.io.*;

class LastIndxOcc3{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int x = Integer.parseInt(br.readLine());

    String line = br.readLine();
    String[] str = line.trim().split("\\s+");

    int[] ar = new int[n];
    for(int i=0;i<ar.length;i++){
      ar[i] = Integer.parseInt(str[i]);
    }

    int ans = LIO3(ar,0,x);
    System.out.println(ans);

  }

  public static int LIO3(int[] ar, int idx, int x){
    
    if(idx == ar.length){
      return -1;
    }

    int li = LIO3(ar,idx+1,x);

    if(li != -1){
      return li;
    }
    else{
      if(ar[idx] == x){
        return idx;
      }
      else{
        return -1;
      }
    }
    
  }
}