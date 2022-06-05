class Solution {
    private int count = 0;
    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        backtrack(board, 0, n);
        
        return count;
    }
    
    private void backtrack(int[][] board, int row, int queens) {
        if(queens == 0) {
            count += 1;
            return;
        }

        for(int col = 0; col < board.length; col++) {
            if(board[row][col] == 0) {
                visit(board, row, col, 1);
                backtrack(board, row + 1, queens - 1);
                visit(board, row, col, -1);
            }
        }
    }
    
    private void visit(int[][] board, int row, int col, int value) {
        int n = board.length;
        // diags
        for(int i = 0; i + row < n && i + col < n; i++) {
            board[i + row][i + col] += value;
        }
        
        for(int i = 0; row - i >= 0 && col - i >= 0; i++) {
            board[row - i][col - i] += value;
        }
        
        // anti diags
        for(int i = 0, j = 0; i + row < n && col - j >= 0; i++, j++) {
            board[i + row][col - j] += value;
        }
        
        for(int i = 0, j = 0; row - i >= 0 && col + j < n; i++, j++) {
            board[row - i][col + j] += value;
        }
        
        // row
        for(int i = 0; i < n; i++) {
            board[row][i] += value;
        }
        
        //col
        for(int i = 0; i < n; i++) {
            board[i][col] += value;
        }        
    }
}