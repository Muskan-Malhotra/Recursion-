package Recursion_With_ArrayList;

import java.io.*;
import java.util.*;

/**
 * jump<= dc-sr == if dc = 4 and sc = column1 then 4-1 = 3 jumps can be taken horizontally
 * the conditon in for loop for dc-sr is important becoz sr+jump is taking place which will lead to jumps outside the box and this condition is not favourable.
 * 
 * ---------------ALGO--------------------
 * loop over to get the jumps coz we can't take one jump
 * get all the paths from nbr to dest and save in AL horizontal
 * for each loop inside the outer loop coz this will help us get paths in sequence:: w/o for each the paths are correct but seq is disturbed.
 * To make it from src to dest = src to nbr + nbr to dest is required :: in short add you first move either in h,v or d direction
 * 
 * Time: 3^(n+m)
 * Space: O(1)  if the AL keeps on incs and decs in size the space complexity is same as time complexity
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
    for(int jump=1;jump<=dc-sc;jump++){
      ArrayList<String> h = gmjump(sr,sc+jump,dr,dc);
      for(String values:h){
        myans.add("h"+jump+values);
      }
    }

    // for column
    for(int jump=1;jump<=dr-sr;jump++){
      ArrayList<String> v = gmjump(sr+jump,sc,dr,dc);

      for(String values:v){
        myans.add("v"+jump+values);
      }
      
    }

    // for diagnol
    for(int jump=1;jump<=dr-sr && jump<=dc-sc;jump++){
      ArrayList<String> d = gmjump(sr+jump,sc+jump,dr,dc);
      for(String values:d){
        myans.add("d"+jump+values);
      }
    }

    

    return myans;
  }
}