// 3
// 4
// 33 36 27 15 
// 5
// 43 35 36 42 49 
// 6
// 21 12 27 40 9 13 

// class Main{
//   public static void main(String[] args) throws IOException{
      
//       //Driver Code
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       int Q = Integer.parseInt(br.readLine());
      
//       for(int k=0;k<Q;k++){
//           int n = Integer.parseInt(br.readLine());
      
//           String line = br.readLine();
//           String str[] = line.trim().split("\\s+");
          
//           int[] ar = new int[n];
          
//           for(int i=0;i<ar.length;i++){
//               ar[i] = Integer.parseInt(str[i]);
//           }
          
//           //For output
//           int ans = Wave(ar);
//           System.out.println(ans);  
//       }
      
      
//   }




  import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        
        //Driver Code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        
        for(int k=0;k<Q;k++){
            int n = Integer.parseInt(br.readLine());
        
            String line = br.readLine();
            String str[] = line.trim().split("\\s+");
            
            int[] ar = new int[n];
            
            for(int i=0;i<ar.length;i++){
                ar[i] = Integer.parseInt(str[i]);
            }
            
            //For output
            int ans = Wave(ar);
            System.out.println(ans);  
        }
        
        
    }
    
    public static int Wave(int[] ar){
        
        //creating an array
        ArrayList<Integer> waveAns = new ArrayList<>();
        //works only if there are two elements in the array
        
        if(ar.length == 1){
            return ar[0];
        }
      
        int i = 0;
        int j = 1;
        int k = 0;
        
        while(k<ar.length){
            if(i<ar.length && j <ar.length){
                if(i<=j){
                    waveAns.add(ar[i]);
                }
                else if(i>=j){
                    waveAns.add(ar[i]);
                }
            }
            i++;
            j++;
            k++;
        }

        
    //   for(int ele:ar){
           System.out.println(waveAns);
        // }
       return 0;
    }
    
}
  