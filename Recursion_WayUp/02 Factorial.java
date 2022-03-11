package Recursion_WayUp;

import java.util.*;

class Factorial {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    fact(n,1);
    
    scn.close();
  }

  public static void fact(int n,int ans){
    if(n == 0){
      System.out.println(ans);
      return;
    }
    // System.out.println(n);
    fact(n-1,ans*n);
  }
  
}