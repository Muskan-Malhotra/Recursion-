package Recursion_With_ArrayList;

import java.util.*;
import java.io.*;

/**  PRO ACTIVE CALL
 * Make sure the calls are made looking at the -ve base in advance
 * 2 calls for h and v
 * Faith 0,1 knows the path to 2,2
 * Expectation reach: add "h" to ans of AL  == (My work is inside for loop)
 * Same faith for 1,0 for v and expectation
 * Base case==> as and when sr == dr and sc == dc return [""]
 * -ve Base Case ==> When we stand outside the matrix sr>dr and sc>dc  === this is not required in breating empty arL
 * The working starts from 2,2
 * Time= O(2^n); Space = O(n)
*/

class GMP{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int r = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    ArrayList<String> ans = gmp(0,0,r-1,c-1);
    System.out.println(ans);
  }

  // sr = source row
  // sc = sourse column
  // dr = destination row
  // dc = destination column

  public static ArrayList<String> gmp(int sr, int sc, int dr, int dc){

    if(sr == dr && sc == dc){
      ArrayList<String> base = new ArrayList<>();
      base.add(".");
      return base;
    }

    ArrayList<String> h = new ArrayList<>();  //gives error if left without initialization, coz then it has null
    ArrayList<String> v = new ArrayList<>();  //gives error if left without initialization, coz then it has null

    //for horizontal
    if(sc+1 <= dc){
      h = gmp(sr,sc+1,dr,dc);
    }
    //for vertical
    if(sr+1 <= dr){
      v = gmp(sr+1,sc,dr,dc);
    }

    ArrayList<String> ans = new ArrayList<>();
    // System.out.println(h);
    // System.out.println(v);

    // System.out.println(ans);
    for(int i=0;i<h.size();i++){
      ans.add("h"+h.get(i));
    }
    for(int i=0;i<v.size();i++){
      ans.add("v"+v.get(i));
    }

    return ans;
  }
}