class Solution {

    public int uniquePathsWithObstacles(int[][] g) {
        int ans[][] = new int[g.length][g[0].length];
        int n = g.length, m = g[0].length;
        ans[n - 1][m - 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if(g[i][j] == 1){
                    ans[i][j] = 0;
                    continue;
                }
                if (i == n - 1 && j == m - 1) {
                    continue;
                }
                
                if(i+1 < n){
                    ans[i][j] += ans[i+1][j]; //down
                }
                
                if(j+1 < m){
                    ans[i][j] += ans[i][j+1]; //right
                }
                
            }
        }
        
        return ans[0][0];
    }
}
