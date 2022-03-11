package Recursion_WayUp;
/**
 * ALGORITHM
 * levels and options are important 
 * levels of a,b,c and options of yes or no.
 * So 2^3 is the time complexity 2 as the options and 3 being the levels.
 * psf = Path So Far
 * Time : 2^n
 * Space: O(1)
 */


import java.io.*;

class Subsequence {
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Subseq(str,"");
  }

  public static void Subseq(String str, String psf){

    if(str.length()==0){
      System.out.print(psf+" ");
      return;
    }

    // ? IMPORTANT: after adding 'a' as str(0) the psf(path so far) next time the str = remstr and b as str(0)

    // for(int i=0;i<str.length();i++){  do't use not required print duplicate values
      char ch = str.charAt(0);  //a
      String remstr = str.substring(1);  //bc

      //Yes choice
      Subseq(remstr,psf+ch);

      //No choice
      Subseq(remstr,psf);

    // }
    
  }
}