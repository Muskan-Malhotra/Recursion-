package ExtraQuestions_Recursion;

/**
 * Q2. Reverse an Array using recursion
 * TIme: O(n) //n is the array length
 * Space: O(1) //coz in place algorithm
 */

public class ArrayReversal {
  public static void main(String[] args) {
    int[] ar = {4,5,6,7,8,9,10};
    
    RevArr(ar,0);
  }

  public static void RevArr(int[] ar,int idx){

    if(idx == ar.length){
      return;
    }

    RevArr(ar, idx+1);

    System.out.print(ar[idx]+" ");
  }
  
}