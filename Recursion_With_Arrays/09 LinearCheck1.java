package Recursion_With_Arrays;
/**
 * Question: Check if a straight line can be drawn from the given X and Y coordinates.
 * Brute force: Using for loop to check if the x coordinates for all the points are same ans vice versa.
 */
import java.util.*;

class LinearizeCheck1 {
  public static void main(String[] args){
    //taking user input in pair
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] X = new int[n];
    int[] Y = new int[n];

    for(int i=0;i<n;i++){
      X[i] = scn.nextInt();
      Y[i] = scn.nextInt();

    }
    int ans = Linear(X,Y,0);

    if(ans == 0){
      System.out.println("No Line can be generated");
    }
    else if(ans == 1){
      System.out.println("It is a vertical Line");
    }
    else if(ans == 2){
      System.out.println("It is a horizontal line");
    }
    else{
      System.out.println("Both horizontal and vertical line can be created");
    }

    System.out.println(ans);

  }

  public static int Linear(int[] X, int[] Y,int i){
    if(i == X.length-1){
      return 3;
    }
    
    //look at the function call different in both the programs

    int state = Linear(X,Y,i+1);
    // System.out.println(i);
    // here i is behind the actual index i.t i here will stop on 3. for n at 5

    // state = 0 (VX, HX); state = 1 (V); state = 2 (H); state = 3 (HV)
    if(state == 0){
      return 0;
    }
    else if(state == 1){
      if(X[i] == X[i-1]){
        return 1;
      }
      else{
        return 0;
      }
    }
    else if(state == 2){
      if(Y[i] == Y[i+1]){
        return 2;
      }
      else{
        return 0;
      }
    }
    else if(state == 3){
      if(X[i] == X[i-1] && Y[i+1] == Y[i]){
        return 3;
      }
      else if(Y[i] == Y[i-1]){
        return 2;
      }
      else{
        return 1;
      }
    }
    return state;

  }

  
}