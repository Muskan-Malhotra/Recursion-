import java.io.*;

class fibonacci{
  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int ans = fibo(n);
    System.out.println(ans);
  }

  public static int fibo(int n){

    if(n == 0){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    int ans = fibo(n-1) + fibo(n-2);

    return ans;
  }
}