class Solution {
    public List<List<String>> solveNQueens(int n) {
        int chess[][]=new int[n][n];
        List<List<String>> res=new ArrayList<>();
        nQueens(chess,new ArrayList<>(),0,res);
        return res;
    }
    public void nQueens(int chess[][],List<String> lst,int row,List<List<String>> res){
      if(row==chess.length){
        res.add(new ArrayList<>(lst));
        return;
      }
      
      for(int col=0;col<chess.length;col++){
        
        if(isQueenValid(chess,row,col)){
          chess[row][col]=1;
          char arr[]=new char[chess.length];
          Arrays.fill(arr,'.');
          arr[col]='Q';
          lst.add(new String(arr));
          nQueens(chess,lst,row+1,res);
          lst.remove(lst.size()-1);
          chess[row][col]=0;
        }
        
      }
    }
   public boolean isQueenValid(int chess[][],int row,int col){
     //for vertical attack check
     for(int i=row-1,j=col;i>=0;i--){
       if(chess[i][j]==1) return false;
     }
     
    //for one digonal check
     for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
       if(chess[i][j]==1) return false;
     }
     //for another diagonal check
     for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
       if(chess[i][j]==1) return false;
     }
     
     return true;
   }
}
