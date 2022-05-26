class Solution {
     public class pair implements Comparable<pair>{
        int row;
        int col;
        int msf;
        pair(int row,int col , int msf){
            this.row = row;
            this.col = col;
            this.msf = msf;
        }
          @Override
          public int compareTo(pair o){
              return this.msf - o.msf;
          }
    }
    
    public int swimInWater(int[][] grid) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        
        int n = grid.length;
        boolean vis[][] = new boolean[n][n];
           
        pq.add(new pair(0,0,grid[0][0]));
        
        int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        
        while(pq.size() >0){
            pair rem = pq.remove();
            
            if(rem.row == n-1 && rem.col == n-1){
                return rem.msf;
            }
            
            if(vis[rem.row][rem.col] == true) continue;
            
            vis[rem.row][rem.col] = true;
            for(int i = 0;i<4;i++){
                int rd = dir[i][0] + rem.row;
                int cd = dir[i][1] + rem.col;
                
                if(rd < 0  || cd < 0 || rd >= n || cd >= n || vis[rd][cd] == true){
                    continue;
                }
                
                pq.add(new pair(rd,cd,Math.max(rem.msf,grid[rd][cd])));
            }
        }
        
        return 0;
    }
    
    
  
    
}