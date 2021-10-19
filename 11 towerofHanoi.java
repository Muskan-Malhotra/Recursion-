import java.io.*;

class towerofHanoi{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    toh(n,1,2,3);
  }

  public static void toh(int n, int src, int h, int dest){

    //base case
    if(n==0){
      return;
    }

    //faith is to move (n-1) disc' from src to h using dest
    toh(n-1,src,dest,h);

    //my work is to place the nth disc from src to dest
    System.out.println("Move disc "+n+" from "+ src + " to "+ dest);

    //faith to move the (n-1) disc' from helper to dest
    toh(n-1,h,src,dest);


  }
}