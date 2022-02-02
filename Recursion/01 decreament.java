import java.io.*;

class decreament {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
  
    dec(n);
  }
  

  public static void dec(int n){

    //base condition

    if(n==0){
      return;
    }
    System.out.println(n);
    dec(n-1);
    
  }

}