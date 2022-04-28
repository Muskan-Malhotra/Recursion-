package Recursion_WayUp;

import java.util.*;

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