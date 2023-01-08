import java.util.Arrays;
import java.util.Comparator;


//Given pair of numbers . Form a chain of pairs stisfying gollowing conditions - 
// (a,b)-(c,d)  (c,d) can only join the chain if b<c 
// Find longest chain that can be formed.


public class MaxChainLen {
    public static void main(String[] args) {
        int[][] pairs = {
            {5,24},{39,60},{5,28},{27,40},{50,90}
        };

        int chainLen = getChainLength(pairs);
        System.out.println(chainLen);

    }

    public static int getChainLength(int[][] pairs){
    Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

    int len = 1;
    int lastNum = pairs[0][1];

    for(int i=1;i<pairs.length;i++){
        if(pairs[i][0] > lastNum){
            len++;
            lastNum = pairs[i][1];
        }
    }
    return len;


    }
}
