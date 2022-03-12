package Recursion_WayUp;

import java.io.*;


/**
 * ===================GET KPC ================================
 * Similar to subsequence the only differnce is we have added an array
 * Input is sequence of strings in number. 
 * get the first number as character 
 * '7'-'0' = 7;
 * rem string = 8
 * myans = vwx
 * loop over to get each character and add the recursive function here only.
 * the recursive function adds the asf(answer so far) with the charater.
 * Time: O(2^n);  --> this is becoz at every step the growth is twice the previous one.
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