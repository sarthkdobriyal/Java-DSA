package backtraking;

public class Nqueens {
    public static void main(String[] args) {
        int n =4;
        char[][] board = new char[n][n];

        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nqueens(board, 0);
    }

    private static void nqueens(char[][] board , int row) {
        if(row == board.length){
            print(board);
            return;
        }

        for(int j=0;j<board.length;j++){
           if(isSafe(board, row, j)){
            board[row][j] = 'Q';
            nqueens(board, row+1);
            board[row][j] = '.';
           }
        }

    }

    //Checking is cell safe to put queen
    private static boolean isSafe(char[][] board, int row, int col) {
        //column up
        for(int i = row-1; i>=0;i-- ){
            if(board[i][col] == 'Q') return false;
        }
        //diagonal left up
        for(int i =row-1, j= col-1;i>=0 && j>=0;i--, j--){
            if(board[i][j] == 'Q') return false;
        }
        //diagonal right up
        for(int i = row-1,j=col+1;i>=0 && j<board.length;i--,j++ ){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }


    //print board
    private static void print(char[][] board) {
        System.out.println("------- CHESS BOARD -----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
