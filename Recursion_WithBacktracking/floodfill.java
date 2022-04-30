package Recursion_WithBacktracking;
import java.util.*;

public class floodfill {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j] = scn.nextInt();
        }
    }
    boolean[][] visited = new boolean[n][m];
    fldfill(arr, 0, 0, "",visited);
    scn.close();
}
  

// asf -> answer so far
public static void fldfill(int[][] maze, int sr, int sc, String asf,boolean[][] vis) {
        
  if(sr == maze.length-1 && sc == maze[0].length-1){
      System.out.println(asf);
      return;
  }
  
  if(sr>=maze.length || sc>=maze[0].length || sr<0 || sc<0 || maze[sr][sc] == 1 || vis[sr][sc] == true){
      return;
  }
  
  vis[sr][sc] = true;
  
  //call for top
  fldfill(maze,sr-1,sc,asf+"t",vis);
  //call for left
  fldfill(maze,sr,sc-1,asf+"l",vis);
  //call for down
  fldfill(maze,sr+1,sc,asf+"d",vis);
  //call for right
  fldfill(maze,sr,sc+1,asf+"r",vis);
  
  vis[sr][sc] = false;
  
  

}
}
