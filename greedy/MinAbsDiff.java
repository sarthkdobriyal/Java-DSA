import java.util.Arrays;

public class MinAbsDiff {
    public static void main(String[] args) {
        int a[] = {3,2,1};
        int b[] = {1,2,3};

        int minSum = getMinDiff(a,b);

        System.out.println(minSum);

    }

    public static int getMinDiff(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;

        for(int i=0;i<a.length;i++){
            sum += Math.abs(a[i] - b[i]);
        }

        return sum;




    }


}
