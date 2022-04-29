package Recursion_WayUp;
import java.io.*;
/**
 * Only one or two calls are required coz only two types of integer input gives alphaets 1 to 9 and 10 to 26
 * 2 = b? --> val = '2'-'0' / Integer.parseInt(str) == 2 --> 2+'a'==>(97+2 == 99-1) ==> c-1 = b
 * Get one character
 * Get the remstr
 * convert to charater
 * call the recusrion add the asf
 * DO as above for two characters
 * Time= O(2^n)
 * Space = O(1)
 */

class Encoding {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String st = br.readLine();

    printEncoding(st,"");
    
  }

  public static void printEncoding(String st, String asf){

    //base case
    if(st.length() == 0){
      System.out.println(asf);
      return;
    }

    

    //call for one character
    char ch = st.charAt(0);
    if(ch == '0'){
      return;
    }
    String remstr = st.substring(1);

    System.out.println(remstr);
    
    int val = ch-'0';
    char encode = (char)(val+'a'-1);

    printEncoding(remstr,asf+encode);

    if(st.length()>=2){
      String str = st.substring(0,2);
      String remstrg = st.substring(2);
      System.out.println(remstrg);

      int value = Integer.parseInt(str);

      if(value<=26){
        char Encode = (char)(value+'a'-1);

        printEncoding(remstrg, asf+Encode);
      }
      

    }

  }
}