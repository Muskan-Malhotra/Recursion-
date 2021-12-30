import java.io.*;


class factorial{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int ans = fact(n);
    System.out.println(ans);

  }

  public static int fact(int n){
      if(n==0){
        return 1;
      }

      int a = n*fact(n-1);

      return a;
      
      
    }
}