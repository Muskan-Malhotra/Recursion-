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

  static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    kpc(str,"");
    

  }  

  public static void kpc(String str, String asf){
    if(str.length()==0){
      System.out.println(asf);
      return;
    }

    char ch = str.charAt(0);
    String rem = str.substring(1);

    String myans = codes[ch-'0'];
    // System.out.println(myans);

    for(int i=0;i<myans.length();i++){
      char chr = myans.charAt(i);

      kpc(rem,asf+chr);
    }


  }
}