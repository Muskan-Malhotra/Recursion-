package Recursion_With_Arrays;

import java.io.*;

/**
 * 08 AllIndxOcc
 */
class AllIndxOcc {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int x = Integer.parseInt(br.readLine());
    
    String line = br.readLine();
    String[] str = line.trim().split("\\s+");
    
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = Integer.parseInt(str[i]);
    }
    AIO(arr,0,x);
  }
    

  public static void AIO(int arr[], int idx, int x){
    
    if(idx == arr.length){
      return;
    }

    if(arr[idx] == x){
      System.out.println(idx);
    }
    AIO(arr, idx+1, x);

    return;
  }

 
  
}