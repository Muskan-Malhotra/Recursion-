// package 01 Recursion;
import java.io.*;

class pattern1 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    pattern1(n);

  }
  public static void pattern1(int n){
    if(n==0){
      return;
    }

    pattern1(n-1);
    //done with a single for loop
    for(int i=0;i<n;i++){
      System.out.print("*"+"\t");
    }
    System.out.println();
    
  }
  
}