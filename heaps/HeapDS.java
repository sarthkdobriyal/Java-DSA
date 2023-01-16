package heaps;

import java.util.ArrayList;

public class HeapDS {

public static class Heap{
    ArrayList<Integer> arr = new ArrayList<>();


    public void add(int data){
        //add at last index
        arr.add(data);

        //idx of new node
        int x = arr.size()-1;
        //parent idx
        int par = (x-1)/2;

        while(arr.get(x) < arr.get(par)){
            //swapping with parent
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
            x = par;
            par = (x-1)/2;
        }

        
    }


    public int remove(){
        int data = arr.get(0);

        //swap first and last node;
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        //remove last node
        arr.remove(arr.size()-1);

        //fix heap
        heapify(0);

        return data;
    }

    private void heapify(int i){
        int left = (2*i)+1;
        int right = (2*i)+2;

        int minIdx = i;
        
        if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
            minIdx = left;
        }
        if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
            minIdx = right;
        }

        if(minIdx != i){
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx,temp);

            heapify(minIdx);
        }  
    }

    public  boolean isEmpty(){
        return arr.size() == 0;
    }




    public int peek(){
        return arr.get(0);
    }


}


    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);   
        h.add(3);   
        h.add(2);   
        h.add(1);
        
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

    }
}