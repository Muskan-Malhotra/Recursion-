package Recursion_With_ArrayList;
import java.io.*;
import java.util.*;

/**
 * SUBSEQUENCE OF STRINGS USING ARRAYLIST AND RECURSION
 * AL add operation is O(1)
 * AL remove operation is O(n)
 * AL has three important components Size, Capacity and Data
 * ==================== ALGO ========================
 * Get the first character of the string   //a
 * Get the remaining with the help of substring function of string   //bc
 * Recurse over the remaining string i.e bc and capture the result in arraylist
 * Create myresult as the new ArrayList, to add the result of the recursion
 * Only one call is required when the character says yes to be added along with the recursion ans arraylist
 * Or else the reurcion ans will be added as it is in the myresult AL.
 * New Arraylist was created two times one for base case and other(myRes) for adding the recAns AL in the myresult AL.
 */

class Subsequence2 {

  public static ArrayList<String> Subseq(String str){
    //base case
    if(str.length() == 0){
      ArrayList<String> base = new ArrayList<>();
      //empty string returning is very imp, becoz else the AL will remain empty forever
     //And with this AL the characters will be added
      base.add("");
      return base;

    }


    //getting the first character
    char fch = str.charAt(0);

    //getting the remaining string
    String remSt = str.substring(1);

    ArrayList<String> recAns = Subseq(remSt);
    ArrayList<String> myres = new ArrayList<>();

    for(int i=0;i<recAns.size();i++){
      myres.add(recAns.get(i));
    }
    for(int i=0;i<recAns.size();i++){
      myres.add(fch + recAns.get(i));
    }

    return myres;

  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    ArrayList<String> ans = Subseq(str) ;
    System.out.println(ans);

  }  

  
}