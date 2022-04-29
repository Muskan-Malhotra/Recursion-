package Recursion_WayUp;

import java.util.*;
/**
 * Algo
 * abcd --> for each character from the string
 * get each character of the string
 * remstring is left+right  (leaving the choosen charater)
 * Call the recursion
 * 
 * Time = O(n!)  this is because it depends on length ans 1 IP-> 1 OP
 * 2 IP -> 2 OP(2*1)
 * 3 IP -> 6 OP(3*2).....
 * Space = O(1)
 * 
 */

class Permutation{

  public static void main(String[] args) throws Exception {
      
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      
      printPermutations(str,"");
      scn.close();

  }

  public static void printPermutations(String str, String asf) {
      
      if(str.length() == 0){
          System.out.println(asf);
          return;
      }
      
      for(int i=0;i<str.length();i++){
          char ch = str.charAt(i);
          String remSt = str.substring(0,i)+str.substring(i+1,str.length());
          
          printPermutations(remSt,asf+ch);
      }
      
  }

}