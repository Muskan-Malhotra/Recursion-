package Recursion_With_ArrayList;

import java.util.*;
import java.io.*;

/**
 * Time = O(3^n) --> three calls from every path/floor
 * Space = O(n)
 * expectation n to 0 path is possible
 * faith == n-1, n-2, n-3 path will definitely be possible.
 * Meet expectation with faith by givings ones contribution.
 */

class GetStairPath{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    ArrayList<String> ans = gsp(n);
    System.out.println(ans);
  }

  public static ArrayList<String> gsp(int n){

    if(n == 0){
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }

    if(n<0){
      ArrayList<String> base = new ArrayList<>();
      return base;
    }

    ArrayList<String> nm1 = gsp(n-1);  //n-1 to 0   3 to 0   After jump of 1 standing on 3
    ArrayList<String> nm2 = gsp(n-2);  //n-2 to 0   2 to 0   After jump of 2 standing on 2
    ArrayList<String> nm3 = gsp(n-3);  //n-3 to 0   1 to 0   After jump of 3 standing on 1

    ArrayList<String> myans = new ArrayList<>();

    for(int i=0;i<nm1.size();i++){
      //now n to 0;  4 to 3 + 3 to 0
      myans.add("1"+nm1.get(i));
    }
    for(int i=0;i<nm2.size();i++){
      //now n to 0;  4 to 3 + 3 to 0
      myans.add("2"+nm2.get(i));
    }
    for(int i=0;i<nm3.size();i++){
      //now n to 0;  4 to 3 + 3 to 0
      myans.add("3"+nm3.get(i));
    }

    return myans;
  }
}