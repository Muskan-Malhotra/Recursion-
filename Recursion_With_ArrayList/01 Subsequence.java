package Recursion_With_ArrayList;
import java.util.*;

class Subsequence {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    ArrayList<String> ar = Subseq(str);
    System.out.println(ar);
    scn.close();
  }

  public static ArrayList<String> Subseq(String str){

    if(str.length() == 0){
      ArrayList<String> Base = new ArrayList<>();
      Base.add("");
      return Base;
    }

    char ch = str.charAt(0);  //index at 0
    String rem = str.substring(1);  //rem string

    ArrayList<String> recAns = Subseq(rem);  //get ans of recursion in an arraylist
    int siz = recAns.size();

    for(int i=0;i<siz;i++){
      recAns.add(ch+recAns.get(i));
    }

    return recAns;


  }

  
}