package backtraking;


//Question 1 :Rat in a Maze 
// You are given a starting position for a rat which is stuck in a maze at an initial point(0,0)(the maze can be thought of as a 2-dimensional plane).The maze would be given in the form of a square matrix of order N*N where the cells with value 0 represent the maze’s blocked locations while value 1 is the open/available path that the rat can take to reach its destination.The rat's destination is at (N - 1, N - 1).Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.The possible directions that it can take to move in the maze are
//'U'(up)i.e.(x,y-1),
//'D'(down)i.e. (x, y + 1) ,
//'L' (left) i.e. (x - 1, y), 
//'R' (right) i.e. (x + 1, y).

// Sample Input: 
 // int maze[][] = { { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 } };
// Sample Output: 1  0  0  0
              //  1  1  0  0
              //  0  1  0  0
              //  0  1  1  1

public class RatMaze {
    public static void main(String[] args) {
        int maze[][] = {
            { 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 }
                        }; 
        boolean visited[][] = new boolean[maze.length][maze[0].length];
        for(int i=0;i<visited.length;i++){
            for(int j=0;j<visited[0].length;j++){
                visited[i][j] = false;
            }
        }

        print(maze);
        mazeWays(maze,0, 0, visited);
    }

    private static void mazeWays(int[][] maze , int row, int col, boolean[][] visited){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println("Path Found");
            print(maze);
            return;
        }

        if(visited[row][col] == true || row < 0 || col < 0 || row > maze.length-1 || col > maze[0].length-1 ){
            return;
        }
        if( maze[row][col] == 0) return;

        visited[row][col] = true;
        mazeWays(maze, row+1, col, visited); //Down
        mazeWays(maze, row-1, col, visited); //up
        mazeWays(maze, row, col+1, visited); // right
        mazeWays(maze, row, col-1, visited); //left
        visited[row][col] = false;
    }


    private static void print(int[][] board) {
        System.out.println("------- MAZE -----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
