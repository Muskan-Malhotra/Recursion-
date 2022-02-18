package Recursion_With_ArrayList;

import java.io.*;
import java.util.*;

/**
 * ===================GET KPC ================================
 * Similar to subsequence the only differnce is we have added an array
 * Input is sequence of strings in number. 
 * get the first number as character and after the . is encountered return the arraylist.
 * '5'-'0' = 5;
 * first getting the character 5 and then go to that index in array to get the string
 * traverse the string and just inside it traverse the recAns arraylist
 * The for loop outer one is traverse just once but then the arraylist is traversed again and again.
 * Time: O(n);
 * Space: O(1);
 */

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