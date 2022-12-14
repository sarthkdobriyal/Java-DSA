package arraylist;

import java.util.ArrayList;


//Find if a pair exists whose sum is equal to the target sum in a given sorted and rotated arraylist.



public class PairSumTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(10);
        System.out.println("List = " + list);
        int targetSum = 23;

        ArrayList<Integer> res =  findPair(list, targetSum);
        if(res.isEmpty()){
            System.out.println("Pair does not exists");
        }else{
            System.out.println("Pair exists at: " + res);
        }
    }

    private static ArrayList<Integer> findPair(ArrayList<Integer> list, int target) {
        ArrayList<Integer> res = new ArrayList<>();

        //Find pivot point;
        int pivot  = 0;

        for(int i =0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                pivot = i;
                break;
            }
        }

        int i =pivot+1;
        int j = pivot;

        while(i != j){
            int sum = list.get(i) + list.get(j);
            if(sum == target){
                res.add(i);
                res.add(j);
                return res;
            }else if(sum > target){
                j = (list.size()+j-1)%list.size();
            }else{
                i = (i+1)%list.size();
            }
        }
        return res;
    }












}
