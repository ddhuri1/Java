class TicTacToe 
{

    int rows[];
    int cols[];
    int diagonal;
    int antiDiagonal;
    int n;
    /** Initialize your data structure here. */
    public TicTacToe(int n) 
    {
        this.n = n;
        rows = new int[n];
        cols = new int[n];
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) 
    {
        int count = (player == 1) ? 1 : -1;        

        rows[row] += count;
        cols[col] += count;

        if(row == col) diagonal += count;
        if(col + row == n - 1) antiDiagonal += count;

        if(rows[row] == n || cols[col] == n || diagonal == n || antiDiagonal == n)
            return 1;
        if(rows[row] == -n || cols[col] == -n || diagonal == -n || antiDiagonal == -n)
            return 2;
        return 0;   
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */