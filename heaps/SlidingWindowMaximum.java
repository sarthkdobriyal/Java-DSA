package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
 
    public static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};

        int k = 3;

        int[] ans = getWindowMax(arr, k);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();

    }

    public static int[] getWindowMax(int[] arr, int k){
        int ans[] = new int[arr.length-k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int i=0;
        for(i=0;i<k;i++){
            pq.add(new Pair(arr[i], i));
        }

        int j=0;
        ans[0] = pq.peek().val;
        while(i<arr.length){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            } 
            pq.add(new Pair(arr[i], i));
            i++;
            ans[++j] = pq.peek().val;
        }
        return ans;
    }
}
