package Recursion_With_ArrayList;

import java.io.*;
import java.util.*;

class KPC {

  static String[] codes = {".;","abc","def","ghi","jkl","mno","qprs","tu","vwx","yz"};
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    ArrayList<String> ans = kpc(str);
    System.out.println(ans);

  }  

  public static ArrayList<String> kpc(String str){

    if(str.length() == 0){
      ArrayList<String> base = new ArrayList<>();
      base.add("");
      return base;
    }

    char ch = str.charAt(0);
    String remString = str.substring(1);

    ArrayList<String> recans = kpc(remString);  //[pt,pu,qt,qu,rt,ru,st,su]
    ArrayList<String> myAns = new ArrayList<>();
    String myChar = codes[ch-'0'];   //[m,n,o]

    for(int i=0;i<myChar.length();i++){
      char chr = myChar.charAt(i);
      for(int j=0;j<recans.size();j++){
        myAns.add(chr+recans.get(j));
      }
    }
    return myAns;
  }
}