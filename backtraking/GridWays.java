package backtraking;


//Given a grid of sixew n*m find number of ways to reach (n-1,m-1) from (0,0). You can only go right or down

public class GridWays {
    public static void main(String[] args) {
        int n= 4, m=3;
        System.out.println("Total ways = " + findWays(0 , 0 , n , m));
    }

    private static int findWays(int i , int j , int n , int m) {
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i == n || j == m){
            return 0;
        }

        return findWays(i+1, j, n, m) + findWays(i, j+1, n, m);
    }


}
