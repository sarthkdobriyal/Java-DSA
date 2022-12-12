package arraylist;

import java.util.*;

public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(5);
        list.add(0);
        list.add(8);
        list.add(10);
        list.add(4);
        list.add(1);
        list.add(7);

        int idx1= 2;
        int idx2 = 5;
       
        printReverse(list);
        swap(list, idx1,idx2);
        System.out.println("Swapped List: " + list);
        printMax(list);
        
        Collections.sort(list);
        System.out.println("Sorted : " + list);
    }   
    
    private static void printReverse(ArrayList list) {
        System.out.print ("List in reverse: ");
        for(int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private static void swap(ArrayList<Integer> list, int i , int j) {
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }

    private static void printMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max ELement is: " + max);
    }

}
