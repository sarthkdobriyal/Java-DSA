package queues;

import java.util.*;

//Given even length queue = {1,2,3,4,5,6,7,8,9,0}
// interleave = {1,6,2,7,3,8,4,9,5,0}



public class InterleaveQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int num : arr){
            q.add(num);
        }

        System.out.println(q);
        interleave(q);

        System.out.println(q);

    }

    public static void interleave(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<>();

        int i=0;
        int size = q.size();
        
        while(i <= (size/2)-1){
            first.add(q.remove());
            i++;
        }
        
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }


    }


}
