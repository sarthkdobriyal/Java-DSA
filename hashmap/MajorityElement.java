package hashmap;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,3,5,1};
        getMajorityElement(arr);
    }

    private static void getMajorityElement(int[] arr) {

        HashMap<Integer, Integer> fmap = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++ ){
            fmap.put(arr[i], fmap.getOrDefault(arr[i], 0) + 1);
        }

        
        Set<Integer> keySet = fmap.keySet();
        for(int val: keySet){
            if(fmap.get(val) > arr.length/3){
                System.out.println(val + " ");
            }
        }
        

    }


}