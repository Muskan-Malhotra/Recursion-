package Recursion_WithBacktracking;

import java.io.*;

/**
 * Algo for placing all the queens in a 2x2 box or nxn box.
 * Number of ways of selecting a box for placing just 2 queens! =  4C2 = 6
 * Different ways of placing queens in a box 2X2 = 2^4 = 16 
 * ^^^^^^^4 queens placed=1, 3 queens placed=4, 2 queens=6, 1 queen = 4
 */

class NQueensPart1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printNQueens(0,0,"",0,n);
        
    }

    public static void printNQueens(int i, int j, String qsf,int queen,int n) {
        
        if(i == n){
            if(queen == n){   //16 ways to place a queen and out of which only 6 ways are captured!!
                System.out.println(qsf);
                
            }
            return;
        }
        
        
        //if queen says yes:
        if(j+1<n){
            printNQueens(i,j+1,qsf+i+"-"+j+" ",queen+1,n);
        }
        else{
            printNQueens(i+1,0,qsf+i+"-"+j+" ",queen+1,n);
        }
        
        
        if(j+1<n){
            printNQueens(i,j+1,qsf,queen,n);   // queen not placed so did not add the i.j values
        }
        else{
            printNQueens(i+1,0,qsf,queen,n);
        }
    
    }   
}
