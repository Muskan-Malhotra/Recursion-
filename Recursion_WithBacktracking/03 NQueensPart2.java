package Recursion_WithBacktracking;

import java.io.*;

/**
 * Algo for placing one queen in each row
 * every row must have one queen
 * for this we gonna use for loop and will place the queens for each column!!
 * and will increase the row for after each placement
 */

class NQueensPart2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printNQueens(0,"",0,n);
        
    }

    public static void printNQueens(int i,String qsf,int queen,int n) {
        
        if(i == n){
          
            System.out.println(qsf);
                
            
            return;
        }
        
        
        //now the queen will always say yes...
        // queen has a number of columns and will sit in any of the column of each row!!
            for(int k=0;k<n;k++)
            {
                printNQueens(i+1,qsf+i+"-"+k+" ",queen+1,n);
                //  i must increase as the queens need to be placed one time in each row
            }
        }
}
