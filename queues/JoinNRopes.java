package queues;

import java.util.*;
// Question 2 :Connect n ropes with minimum cost
// Given are N ropes of different lengths,the task is to connect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
// Sample Input 1: N = 4, arr = [4 3 2 6]
// Sample Output 1: 29

// Sample Input 2: N = 2, arr = [1 2 3]
// Sample Output 2: 9


public class JoinNRopes {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6};
        int n = 4;

        System.out.println(joinRopes(arr,n));
        
    }


    public static int joinRopes(int[] arr, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        System.out.println(pq);

        int res = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            res += first+second;
            pq.add(first+second);
            System.out.println(pq);
        }
        return res;



    }


}
