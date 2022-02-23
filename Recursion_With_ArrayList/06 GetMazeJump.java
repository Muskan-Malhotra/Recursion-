package Recursion_With_ArrayList;

import java.io.*;
import java.util.*;

class GetMazeJump {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int r = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    ArrayList<String> ans = gmjump(0,0,r-1,c-1,0);
    System.out.println(ans);
  }

  public static ArrayList<String> gmjump(int sr, int sc, int dr, int dc, int step){

    if(sr==dr && sc == dc){
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }

    if(sr < dr){
      ArrayList<String> base = new ArrayList<>();
      return base;
    }

    if(sc < dc){
      ArrayList<String> base = new ArrayList<>();
      return base;
    }

    ArrayList<String> myans = new ArrayList<>();
    ArrayList<String> h = new ArrayList<>();
    ArrayList<String> v = new ArrayList<>();
    ArrayList<String> d = new ArrayList<>();

    // for row
    for(int i=1;i+step<=dc;i++){
      h = gmjump(sr,sc+1,dr,dc,step+i);
      // myans.add("h"+i+h.get(i));
    }

    // for column
    for(int i=1;i+step<=dr;i++){
      v = gmjump(sr+1,sc,dr,dc,step+i);
      // myans.add("v"+i+v.get(i));
    }

    // for diagnol
    for(int i=1;i+step<=dr && i+step<=dc;i++){
      d = gmjump(sr+1,sc+1,dr,dc,step+i);
      // myans.add("d"+i+d.get(i));
    }

    

    for(int jump=1;jump<h.size();jump++){
      myans.add("h"+jump+h.get(jump));
    }
    for(int jump=1;jump<v.size();jump++){
      myans.add("v"+jump+v.get(jump));
    }
    for(int jump=1;jump<d.size();jump++){
      myans.add("d"+jump+d.get(jump));
    }

    return myans;
  }
}