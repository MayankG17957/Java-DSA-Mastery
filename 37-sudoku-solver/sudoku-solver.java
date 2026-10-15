class Solution {

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {

       
        if (row == 9) {
            return true;
        }

       
        if (col == 9) {
            return solve(board, row + 1, 0);
        }

        // Skip cells that are already filled
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }

        // Try digits 1 through 9
        for (char digit = '1'; digit <= '9'; digit++) {

            if (isValid(board, row, col, digit)) {

                
                board[row][col] = digit;

               
                if (solve(board, row, col + 1)) {
                    return true;
                }

                board[row][col] = '.';
            }
        }

       
        return false;
    }

    private boolean isValid(
            char[][] board, int row, int col, char digit) {

        for (int i = 0; i < 9; i++) {

           
            if (board[row][i] == digit) {
                return false;
            }

            
            if (board[i][col] == digit) {
                return false;
            }

            
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if (board[boxRow][boxCol] == digit) {
                return false;
            }
        }

        return true;
    }
}