package ExtraQuestions_Recursion;

public class ArrRev2Ptr {
  public static void main(String[] args) {
    int[] ar = {4,5,6,7,8,9,10,11};
    
    int[] ans = RevArr(ar,0,ar.length-1);
    for(int i:ans){
      System.out.print(i+" ");
    }
  }

  public static int[] RevArr(int[] ar,int i, int j){
    if((ar.length%2 != 0 )&& (i==j)){
      return ar;
    }
    else if((ar.length%2 ==0)&&i>j){
      return ar;

    }
    // i++;
    // j--;

    int[] ans = RevArr(ar, i+1, j-1);

    System.out.println("i: "+i);
    System.out.println("j: "+j);

    int temp = ans[i];
    ans[i] = ans[j];
    ans[j] = temp;
    return ans;

  }
  
}