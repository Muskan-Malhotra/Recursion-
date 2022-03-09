package Recursion_WayUp;

class Factorial {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    fact(n,1);
  }

  public static void fact(int n,int ans){
    if(n == 0){
      System.out.println(ans);
    }
    fact(n-1,ans*n);
  }
}