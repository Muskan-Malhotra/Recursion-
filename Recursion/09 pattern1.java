// package Recursion_With_Arrays;
import java.io.*;

class pattern1 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    //M2
    int row = 1;
    int col = 1;

    // pattern1(n);
    pattern_Method2(n,row, col);

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

  public static void pattern_Method2(int n,int row, int col){

    if(n==col){    //or can write r== n+1 then no need to print extra *;
      System.out.print("*");
      return;
    }
    if(row > col){
      System.out.print("* ");
      //same row next column
      pattern_Method2(n,row, col+1);
      
    }

  
    if(row == col){
      //last start of rth row
      System.out.print("*\n");
      // System.out.println();
      //next row and col = 1;
      pattern_Method2(n, row+1,1);
    }
    

  }
  
}