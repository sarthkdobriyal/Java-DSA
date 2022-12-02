package recursionBasics;


//Q --> Given a floor of size '2 x n' and tile size of '2 x 1'. FInd the number of ways floor can be tiled
public class TilingProblem {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tiling(n));
    }

    private static int tiling(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;

        //vertical choice + horizontal choice
        return tiling(n-1) + tiling(n-2);

    }
}
