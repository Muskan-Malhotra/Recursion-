package Recursion_WayUp;

import java.util.*;

class PrintStrairPath {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    prSP(n,"");

    scn.close();
  }

  public static void prSP(int n, String path) {
        
    if(n==0){
        System.out.println(path);
        return;
    }
    if(n<0){
        return;
    }
    
    prSP(n-1,path+'1');
    prSP(n-2,path+'2');
    prSP(n-3,path+'3');
}
  
}