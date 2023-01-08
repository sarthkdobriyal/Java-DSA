import java.util.Arrays;
import java.util.Comparator;


//Given the weights and values of items put these items in a knapsack of capacity W to get max total value in the knapsack


public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;

        int maxValue = getMaxValue(val, weight, W);
        System.out.println(maxValue);
    }

    public static int getMaxValue(int[] vals, int[] weights , int capacity){
        int maxValue = 0;
        double[][] ratio = new double[weights.length][2];
    

        for(int i=0;i<weights.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = vals[i] / (double)weights[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // for(int i=0;i<ratio.length;i++){
        //     System.out.print(ratio[i][0] + " ");
        // }
        // System.out.println();

        for(int i  = ratio.length-1;i>=0;i--){
            if(capacity >= weights[(int)ratio[i][0]]){
                maxValue += vals[(int)ratio[i][0]];
                capacity -= weights[(int)ratio[i][0]];
            }else{
                maxValue += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }




        return maxValue;
    }

}
