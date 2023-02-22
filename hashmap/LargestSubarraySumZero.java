package hashmap;

import java.util.HashMap;

public class LargestSubarraySumZero {
    public static void main(String[] args) {
        int arr[] = {15,-2,2,-8,1,7,10};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int sum =0;
        int len = 0;
        for(int j=0;j<arr.length;j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                int currLen = j - map.get(sum);
                if(currLen > len){
                    len = currLen;
                }
            }else{
                map.put(sum,j);
            }
        }

        System.out.println(len);

    }
}
