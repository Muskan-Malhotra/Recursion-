package Recursion_WithBacktracking;

import java.io.*;

/**
 * Algo for placing all the queens in a 2x2 box or nxn box.
 * Number of ways of selecting a box for placing just 2 queens! =  4C2 = 6
 * Different ways of placing queens in a box 2X2 = 2^4 = 16 
 * ^^^^^^^4 queens placed=1, 3 queens placed=4, 2 queens=6, 1 queen = 4
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
