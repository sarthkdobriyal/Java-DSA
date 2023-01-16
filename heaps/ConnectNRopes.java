package heaps;


import java.util.PriorityQueue;

//Given N ropes with different lengths . Join ropes into one with min cost
//cost to connect two ropes is the sum of their lengths

public class ConnectNRopes {
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        int costToConnect = getMinCost(arr);
        System.out.println("Min Cost to Connect = "+costToConnect);
    }   

    public static int getMinCost(int[] arr){
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         int minCost = 0;

         for(int val: arr){
            pq.add(val);
         }


         while(pq.size() != 1){
             int r1 = pq.remove();
             int r2 = pq.remove();

             int currCost = r1+r2;
             pq.add(r1+r2);
             minCost += currCost;
            }
        return minCost;
        
    }
}
