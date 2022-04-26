package ExtraQuestions_Recursion;

import java.util.*;

/**
 * Q1. Sum of Numbers for eg: for 3-->6
 * Time: O(n) for n number of calls
 * Space: O(n)  -->auxillary space stacks
 *  
 */

class SumN {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    // int ans = NumSum(n);
    NumSum(n,0);
    // System.out.println(ans);

    scn.close();

  }

  //with function
  // public static int NumSum(int n){
  //     //base case
  //     if(n==0){
  //       return 0;
  //     }


  //     int ans = n+NumSum(n-1);

  //     return ans;


  // }


  //with parameter
  public static void NumSum(int n,int sum){

    if(n<1){
      System.out.println(sum);
      return;
    }

    NumSum(n-1,sum+n);
  }
  
}