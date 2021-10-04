// package 01 Recursion;
import java.io.*;


class increaseDec{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    incdec(n);

  }
  public static void incdec(int n){
    
    if(n==0){
      return;
    }

    System.out.println(n);
    incdec(n-1);
    System.out.println(n);
  }
}