import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zigzag{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());

    printZZ(a);

  }

  public static void printZZ(int n){

    if(n==0){
      return;
    }

    System.out.print(n);
    printZZ(n-1);
    System.out.print(n);
    printZZ(n-1);
    System.out.print(n);

  }
}