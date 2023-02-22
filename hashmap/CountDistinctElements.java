package hashmap;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,1,2,3,4,1,2,4,3,1,5};
        System.out.println(distinctElements(arr));
    }

    public static int distinctElements(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i: arr){
            set.add(i);
        }

        return set.size();
    }

}
