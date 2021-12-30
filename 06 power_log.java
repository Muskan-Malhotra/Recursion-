/**
 * 06 power_log
 */
import java.io.*;


class power_log {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    int ans = plog(a,n);
    System.out.println(ans);
  }

  
  
  public static int plog(int a, int n){

    if(n == 0){
      return 1;
    }

    int ans = plog(a,n/2);
    // System.out.println(ans);
    int actu = ans*ans;

    if(n%2 == 1){
      actu = actu*a;
    }
      


    return actu;
  }
  
}