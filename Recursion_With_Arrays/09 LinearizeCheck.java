package Recursion_With_Arrays;



import java.io.*;

class LinearizeCheck {
  public static void main(String[] args) throws IOException{
    int[] X = {1,1,1,0,0};
    int[] Y = {4,4,4,4,4};

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
    
    i++;
    
    int state = Linear(X,Y,i);
    // System.out.println(i);
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
      if(Y[i] == Y[i-1]){
        return 2;
      }
      else{
        return 0;
      }
    }
    else if(state == 3){
      if(X[i] == X[i-1] && Y[i-1] == Y[i]){
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