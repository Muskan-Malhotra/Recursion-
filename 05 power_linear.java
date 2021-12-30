import java.io.BufferedReader;
import java.io.*;


class power_linear{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int ans = powLin(a,n);
    System.out.println(ans);
  }

  public static int powLin(int a, int n) {

    if(n==0){
      return 1;
    }
    // int pow = (int)(Math.pow(a,n-1));

    int an = a*powLin(a, n-1);

    return an;
  }
  
}