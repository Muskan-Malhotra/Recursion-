import java.io.*;

// package 01 Recursion;

class increament{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    inc(n);

  }

  public static void inc(int n){
    if(n==0){
      return;
    }
    inc(n-1);
    System.out.println(n);
  }
  
}