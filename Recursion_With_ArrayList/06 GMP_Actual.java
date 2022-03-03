package Recursion_With_ArrayList;

import java.io.*;
import java.util.*;

/**
 * jump<= dc-sr == if dc = 4 and sc = column1 then 4-1 = 3 jumps can be taken horizontally
 */

class GMP_Actual {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int r = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    ArrayList<String> ans = gmjump(0,0,r-1,c-1);
    System.out.println(ans);
  }

  public static ArrayList<String> gmjump(int sr, int sc, int dr, int dc){

    if(sr==dr && sc == dc){
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }

    ArrayList<String> myans = new ArrayList<>();

    // for row
    for(int jump=1;jump+sc<=dc;jump++){
      ArrayList<String> h = gmjump(sr,sc+jump,dr,dc);
      for(int i=0;i<h.size();i++){
        myans.add("h"+(i+1)+h.get(i));
      }
    }

    // for column
    for(int jump=1;jump+sr<=dr;jump++){
      ArrayList<String> v = gmjump(sr+jump,sc,dr,dc);

      for(int i=0;i<v.size();i++){
        myans.add("v"+(i+1)+v.get(i));
      }
      
    }

    // for diagnol
    for(int jump=1;jump+sr<=dr && jump+sc<=dc;jump++){
      ArrayList<String> d = gmjump(sr+jump,sc+jump,dr,dc);
      for(int i=0;i<d.size();i++){
        myans.add("d"+(i+1)+d.get(i));
      }
    }

    

    return myans;
  }
}