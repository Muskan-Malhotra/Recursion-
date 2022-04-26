package ExtraQuestions_Recursion;

public class Palindrom {
  public static void main(String[] args) {
    String str = "MADAMAM";

    boolean ans = pal(str,0,str.length()-1);
    System.out.println(ans);
  }

  public static boolean pal(String st,int i, int j){

    System.out.println(st.length());

    if(i == st.length()/2 && j == st.length()/2){
      return false;
    }

    if(st.charAt(i) == st.charAt(j)){
      return true;
    }
    boolean ans = pal(st, i++,j--);
    
    return ans;

  }

  
}