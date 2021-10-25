package Recursion_With_Arrays;

import java.io.*;

class DisplayArray {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String line = br.readLine(); // to read multiple integers line
    String[] strs = line.trim().split("\\s+");
    
    int[] arr = new int[n];

    for(int i=0;i<arr.length;i++){
      arr[i] = Integer.parseInt(strs[i]);
    }

    //// For taking vertical input of array
    /* 
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = Integer.parseInt(br.readLine());
    } 
     */
    
    display(arr,0);
    
  }
  public static void display(int[] arr, int idx){
    //base case
    if(idx == arr.length){
      return;     
    }

    System.out.println(arr[idx]);  //our work
    display(arr, idx+1);
  }
}